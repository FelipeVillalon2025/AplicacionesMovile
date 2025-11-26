package com.example.wikiaid.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wikiaid.data.FirstAidRepository
import com.example.wikiaid.data.FirstAidTopic
import com.example.wikiaid.data.FavoritesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class FirstAidViewModel(
    private val repository: FirstAidRepository,
    private val favoritesRepository: FavoritesRepository
) : ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText: StateFlow<String> = _searchText

    val topics: StateFlow<List<FirstAidTopic>> = favoritesRepository.favoriteTopicIds
        .map { favoriteIds ->
            val allTopics = repository.getFirstAidTopics()
            allTopics.map { topic ->
                topic.copy(isFavorite = favoriteIds.contains(topic.id))
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    val filteredTopics: StateFlow<List<FirstAidTopic>> = searchText
        .combine(topics) { text, topicsList ->
            if (text.isBlank()) {
                topicsList
            } else {
                topicsList.filter {
                    it.title.contains(text, ignoreCase = true) || it.category.contains(text, ignoreCase = true)
                }
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun onSearchTextChanged(text: String) {
        _searchText.value = text
    }

    fun toggleFavorite(topicId: String) {
        viewModelScope.launch {
            favoritesRepository.toggleFavorite(topicId)
        }
    }
}

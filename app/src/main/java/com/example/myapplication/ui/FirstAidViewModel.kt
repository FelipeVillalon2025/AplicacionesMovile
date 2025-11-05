package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.FirstAidRepository
import com.example.myapplication.data.FirstAidTopic
import com.example.myapplication.data.FavoritesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

class FirstAidViewModel(
    private val repository: FirstAidRepository,
    private val favoritesRepository: FavoritesRepository
) : ViewModel() {

    private val _topics = MutableStateFlow<List<FirstAidTopic>>(emptyList())
    val topics: StateFlow<List<FirstAidTopic>> = _topics

    private val _searchText = MutableStateFlow("")
    val searchText: StateFlow<String> = _searchText

    private val _filteredTopics = MutableStateFlow<List<FirstAidTopic>>(emptyList())
    val filteredTopics: StateFlow<List<FirstAidTopic>> = _filteredTopics

    init {
        viewModelScope.launch {
            val allTopics = repository.getFirstAidTopics()
            favoritesRepository.getFavoriteTopicIds().collect { favoriteIds ->
                val updatedTopics = allTopics.map { topic ->
                    topic.copy(isFavorite = favoriteIds.contains(topic.id))
                }
                _topics.value = updatedTopics
                _filteredTopics.value = updatedTopics
            }
        }
    }

    fun onSearchTextChanged(text: String) {
        _searchText.value = text
        _filteredTopics.value = _topics.value.filter {
            it.title.contains(text, ignoreCase = true) || it.category.contains(text, ignoreCase = true)
        }
    }

    fun toggleFavorite(topicId: String) {
        viewModelScope.launch {
            favoritesRepository.toggleFavorite(topicId)
        }
    }

    fun getFavorites(): List<FirstAidTopic> {
        return _topics.value.filter { it.isFavorite }
    }
}

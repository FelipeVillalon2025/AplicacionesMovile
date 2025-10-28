package com.example.myapplication.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.FirstAidRepository
import com.example.myapplication.data.FirstAidTopic
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class FirstAidViewModel(private val repository: FirstAidRepository) : ViewModel() {

    private val _topics = MutableStateFlow<List<FirstAidTopic>>(emptyList())
    val topics: StateFlow<List<FirstAidTopic>> = _topics

    private val _searchText = MutableStateFlow("")
    val searchText: StateFlow<String> = _searchText

    private val _filteredTopics = MutableStateFlow<List<FirstAidTopic>>(emptyList())
    val filteredTopics: StateFlow<List<FirstAidTopic>> = _filteredTopics

    init {
        _topics.value = repository.getFirstAidTopics()
        _filteredTopics.value = _topics.value
    }

    fun onSearchTextChanged(text: String) {
        _searchText.value = text
        _filteredTopics.value = _topics.value.filter {
            it.title.contains(text, ignoreCase = true) || it.category.contains(text, ignoreCase = true)
        }
    }

    fun toggleFavorite(topicId: String) {
        val topic = _topics.value.find { it.id == topicId }?.apply { isFavorite = !isFavorite }
        // This is a temporary implementation, in a real app you would persist this change
    }

    fun getFavorites(): List<FirstAidTopic> {
        return _topics.value.filter { it.isFavorite }
    }
}

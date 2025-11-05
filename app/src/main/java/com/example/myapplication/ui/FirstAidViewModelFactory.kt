package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.FirstAidRepository
import com.example.myapplication.data.FavoritesRepository

class FirstAidViewModelFactory(private val repository: FirstAidRepository, private val favoritesRepository: FavoritesRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FirstAidViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FirstAidViewModel(repository, favoritesRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

package com.example.myapplication.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "favorites")

class FavoritesRepository(private val context: Context) {

    private val favoritesKey = stringSetPreferencesKey("favorite_topics")

    fun getFavoriteTopicIds(): Flow<Set<String>> {
        return context.dataStore.data.map {
            it[favoritesKey] ?: emptySet()
        }
    }

    suspend fun toggleFavorite(topicId: String) {
        context.dataStore.edit { preferences ->
            val currentFavorites = preferences[favoritesKey] ?: emptySet()
            val newFavorites = if (currentFavorites.contains(topicId)) {
                currentFavorites - topicId
            } else {
                currentFavorites + topicId
            }
            preferences[favoritesKey] = newFavorites
        }
    }
}

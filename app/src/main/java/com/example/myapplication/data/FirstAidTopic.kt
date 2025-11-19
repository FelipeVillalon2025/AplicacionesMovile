package com.example.myapplication.data

import androidx.compose.ui.graphics.vector.ImageVector

data class FirstAidTopic(
    val id: String,
    val title: String,
    val category: String,
    val imageVector: ImageVector,
    val symptoms: List<String>,
    val howToAct: List<String>,
    val whatNotToDo: List<String>,
    val videoId: String? = null,
    var isFavorite: Boolean = false
)

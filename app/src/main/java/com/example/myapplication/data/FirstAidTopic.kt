package com.example.myapplication.data

import androidx.compose.ui.graphics.vector.ImageVector
import java.util.UUID

data class FirstAidTopic(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val category: String,
    val imageVector: ImageVector,
    val howToAct: List<String>,
    val whatNotToDo: List<String>,
    var isFavorite: Boolean = false
)

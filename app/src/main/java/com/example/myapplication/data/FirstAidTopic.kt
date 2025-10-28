package com.example.myapplication.data

import java.util.UUID

data class FirstAidTopic(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val category: String,
    val howToAct: List<String>,
    val whatNotToDo: List<String>,
    var isFavorite: Boolean = false
)

package com.example.myapplication.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.FirstAidTopic

@Composable
fun TopicDetailScreen(topic: FirstAidTopic, viewModel: FirstAidViewModel) {
    var isFavorite by remember { mutableStateOf(topic.isFavorite) }
    val scale by animateFloatAsState(
        targetValue = if (isFavorite) 1.2f else 1.0f,
        animationSpec = tween(durationMillis = 200)
    )

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = topic.title, style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Text("Cómo actuar:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
        topic.howToAct.forEach {
            Text(text = "• $it")
        }

        Text("Qué no hacer:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
        topic.whatNotToDo.forEach {
            Text(text = "• $it")
        }

        IconButton(onClick = { 
            isFavorite = !isFavorite
            viewModel.toggleFavorite(topic.id) 
        }) {
            Icon(
                imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                contentDescription = "Favorite",
                tint = if (isFavorite) Color.Red else MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.scale(scale)
            )
        }
    }
}

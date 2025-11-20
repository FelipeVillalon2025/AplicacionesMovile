package com.example.myapplication.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.FirstAidTopic

@Composable
fun TopicDetailScreen(topic: FirstAidTopic, viewModel: FirstAidViewModel) {
    val scale by animateFloatAsState(
        targetValue = if (topic.isFavorite) 1.2f else 1.0f,
        animationSpec = tween(durationMillis = 200),
        label = "favoriteScale"
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = topic.title,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            IconButton(onClick = { viewModel.toggleFavorite(topic.id) }) {
                Icon(
                    imageVector = if (topic.isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                    contentDescription = "Favorite",
                    tint = if (topic.isFavorite) Color.Red else MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.scale(scale)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = topic.imageVector,
                contentDescription = "Icono del tema",
                modifier = Modifier.size(80.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Síntomas:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
        topic.symptoms.forEach {
            Text(text = "• $it")
        }

        Text("Cómo actuar:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
        topic.howToAct.forEach {
            Text(text = "• $it")
        }

        Text("Qué no hacer:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
        topic.whatNotToDo.forEach {
            Text(text = "• $it")
        }

        topic.procedureImage?.let { imageRes ->
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Imagen del procedimiento",
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.FillWidth
            )
        }
    }
}

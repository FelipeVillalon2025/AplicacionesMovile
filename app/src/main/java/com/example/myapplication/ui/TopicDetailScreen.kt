package com.example.myapplication.ui

import android.annotation.SuppressLint
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
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
import androidx.compose.ui.viewinterop.AndroidView
import com.example.myapplication.data.FirstAidTopic

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun TopicDetailScreen(topic: FirstAidTopic, viewModel: FirstAidViewModel) {
    val scale by animateFloatAsState(
        targetValue = if (topic.isFavorite) 1.2f else 1.0f,
        animationSpec = tween(durationMillis = 200)
    )
    var showVideoPlayer by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = topic.title, style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

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

        Spacer(modifier = Modifier.height(16.dp))

        topic.videoId?.let { videoId ->
            if (!showVideoPlayer) {
                Button(onClick = { showVideoPlayer = true }) {
                    Text("Ver video")
                }
            } else {
                val embedUrl = "https://www.youtube.com/embed/$videoId"
                
                AndroidView(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f),
                    factory = { context ->
                        WebView(context).apply {
                            settings.javaScriptEnabled = true
                            settings.domStorageEnabled = true
                            webViewClient = WebViewClient()
                            webChromeClient = WebChromeClient()
                            setLayerType(View.LAYER_TYPE_SOFTWARE, null)
                            loadUrl(embedUrl)
                        }
                    }
                )
            }
        }

        IconButton(onClick = { 
            viewModel.toggleFavorite(topic.id) 
        }) {
            Icon(
                imageVector = if (topic.isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                contentDescription = "Favorite",
                tint = if (topic.isFavorite) Color.Red else MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.scale(scale)
            )
        }
    }
}

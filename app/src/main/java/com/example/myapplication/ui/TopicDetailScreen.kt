package com.example.myapplication.ui

import android.annotation.SuppressLint
import android.widget.FrameLayout
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
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.myapplication.data.FirstAidTopic
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

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
                val lifecycleOwner = LocalLifecycleOwner.current

                AndroidView(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f),
                    factory = { context ->
                        FrameLayout(context).apply {
                            val playerView = YouTubePlayerView(context).apply {
                                lifecycleOwner.lifecycle.addObserver(this)
                                addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                                    override fun onReady(youTubePlayer: YouTubePlayer) {
                                        youTubePlayer.loadVideo(videoId, 0f)
                                    }
                                })
                            }
                            addView(
                                playerView,
                                FrameLayout.LayoutParams(
                                    FrameLayout.LayoutParams.MATCH_PARENT,
                                    FrameLayout.LayoutParams.MATCH_PARENT
                                )
                            )
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
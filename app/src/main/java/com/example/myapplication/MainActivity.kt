package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.data.FavoritesRepository
import com.example.myapplication.data.FirstAidRepositoryImpl
import com.example.myapplication.ui.FirstAidListScreen
import com.example.myapplication.ui.FirstAidViewModel
import com.example.myapplication.ui.FirstAidViewModelFactory
import com.example.myapplication.ui.TopicDetailScreen
import com.example.myapplication.ui.theme.MyApplicationTheme // <-- IMPORTANTE: Asegúrate de que esta línea esté

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Esto es correcto: Prepara el tema para los componentes del "viejo" Android (como el YouTubePlayerView)
        setTheme(R.style.Theme_MyApplication)

        super.onCreate(savedInstanceState)

        val repository = FirstAidRepositoryImpl()
        val favoritesRepository = FavoritesRepository(this)
        val viewModelFactory = FirstAidViewModelFactory(repository, favoritesRepository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(FirstAidViewModel::class.java)

        setContent {
            // DEBEMOS RESTAURAR ESTO: Provee el tema para los componentes de Jetpack Compose
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "first_aid_list") {
                        composable("first_aid_list") {
                            FirstAidListScreen(navController = navController, viewModel = viewModel)
                        }
                        composable("topic_detail/{topicId}") { backStackEntry ->
                            val topicId = backStackEntry.arguments?.getString("topicId")
                            val topic = viewModel.getTopicById(topicId ?: "")
                            if (topic != null) {
                                TopicDetailScreen(topic = topic, viewModel = viewModel)
                            }
                        }
                    }
                }
            }
        }
    }
}
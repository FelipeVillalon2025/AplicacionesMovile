package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.data.FavoritesRepository
import com.example.myapplication.data.FirstAidRepositoryImpl
import com.example.myapplication.data.FirstAidTopic
import com.example.myapplication.ui.EmergencyContactsScreen
import com.example.myapplication.ui.FirstAidViewModel
import com.example.myapplication.ui.FirstAidViewModelFactory
import com.example.myapplication.ui.TopicDetailScreen
import com.example.myapplication.ui.navigation.Screen
import com.example.myapplication.ui.navigation.bottomNavItems
import com.example.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    private val viewModel: FirstAidViewModel by viewModels {
        FirstAidViewModelFactory(FirstAidRepositoryImpl(), FavoritesRepository(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = { TopAppBar(title = { Text("Primeros Auxilios") }) },
                    bottomBar = { MyBottomNavBar(navController = navController) }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Screen.Home.route,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(Screen.Home.route) { HomeScreen(viewModel, navController) }
                        composable(Screen.Search.route) { SearchScreen(viewModel, navController) }
                        composable(Screen.Favorites.route) { FavoritesScreen(viewModel, navController) }
                        composable(Screen.EmergencyContacts.route) { EmergencyContactsScreen() }
                        composable(
                            route = Screen.TopicDetail.route,
                            arguments = listOf(navArgument("topicId") { type = NavType.StringType })
                        ) { backStackEntry ->
                            val topicId = backStackEntry.arguments?.getString("topicId")
                            val topic = viewModel.topics.value.find { it.id == topicId }
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

@Composable
fun MyBottomNavBar(navController: NavHostController) {
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        bottomNavItems.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon!!, contentDescription = null) },
                label = { Text(screen.title) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Composable
fun HomeScreen(viewModel: FirstAidViewModel, navController: NavHostController) {
    val topics by viewModel.topics.collectAsState()
    val groupedTopics = topics.groupBy { it.category }.toSortedMap()

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.padding(4.dp)
    ) {
        groupedTopics.forEach { (category, topics) ->
            item(span = { GridItemSpan(maxLineSpan) }) {
                Text(
                    text = category,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp)
                )
            }
            items(topics.sortedBy { it.title }) {
                TopicItem(topic = it, viewModel = viewModel, navController = navController)
            }
        }
    }
}

@Composable
fun TopicItem(topic: FirstAidTopic, viewModel: FirstAidViewModel, navController: NavHostController) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .aspectRatio(1f)
            .clickable { navController.navigate("topic/${topic.id}") },
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = getColorForCategory(topic.category))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "Primeros auxilios",
                tint = Color.White,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = topic.title,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 2
            )
        }
    }
}

@Composable
fun SearchScreen(viewModel: FirstAidViewModel, navController: NavHostController) {
    val searchText by viewModel.searchText.collectAsState()
    val filteredTopics by viewModel.filteredTopics.collectAsState()

    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        TextField(
            value = searchText,
            onValueChange = viewModel::onSearchTextChanged,
            label = { Text("Buscar emergencia") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.padding(top = 8.dp)
        ) {
            items(filteredTopics) {
                TopicItem(topic = it, viewModel = viewModel, navController = navController)
            }
        }
    }
}

@Composable
fun FavoritesScreen(viewModel: FirstAidViewModel, navController: NavHostController) {
    val favoriteTopics by viewModel.topics.collectAsState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.padding(4.dp)
    ) {
        items(favoriteTopics.filter { it.isFavorite }) {
            TopicItem(topic = it, viewModel = viewModel, navController = navController)
        }
    }
}

@Composable
fun getColorForCategory(category: String): Color {
    return when (category) {
        // Peligro (Rojo)
        "Emergencias Graves" -> Color(0xFFD32F2F) // Rojo
        "Traumatismos y Lesiones" -> Color(0xFFD32F2F) // Rojo

        // Alto Riesgo (Naranja)
        "Emergencias Respiratorias" -> Color(0xFFF57C00) // Naranja
        "Problemas de Conciencia" -> Color(0xFFF57C00) // Naranja
        "Problemas Ambientales" -> Color(0xFFF57C00) // Naranja

        // Riesgo Medio (Amarillo)
        "Mordeduras y Picaduras" -> Color(0xFFFBC02D) // Amarillo

        // Riesgo (Verde)
        "Heridas Comunes" -> Color(0xFF388E3C) // Verde

        // Poco Riesgo (Celeste)
        "Problemas Comunes en Niños" -> Color(0xFF0288D1) // Celeste

        else -> MaterialTheme.colorScheme.surfaceVariant
    }
}

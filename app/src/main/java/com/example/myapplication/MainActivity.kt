package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.data.FirstAidRepositoryImpl
import com.example.myapplication.data.FirstAidTopic
import com.example.myapplication.ui.EmergencyContactsScreen
import com.example.myapplication.ui.FirstAidViewModel
import com.example.myapplication.ui.FirstAidViewModelFactory
import com.example.myapplication.ui.navigation.Screen
import com.example.myapplication.ui.navigation.bottomNavItems
import com.example.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    private val viewModel: FirstAidViewModel by viewModels {
        FirstAidViewModelFactory(FirstAidRepositoryImpl())
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
                        composable(Screen.Home.route) { HomeScreen(viewModel) }
                        composable(Screen.Search.route) { SearchScreen(viewModel) }
                        composable(Screen.Favorites.route) { FavoritesScreen(viewModel) }
                        composable(Screen.EmergencyContacts.route) { EmergencyContactsScreen() }
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
                icon = { Icon(screen.icon, contentDescription = null) },
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
fun HomeScreen(viewModel: FirstAidViewModel) {
    val topics by viewModel.topics.collectAsState()
    val groupedTopics = topics.groupBy { it.category }

    LazyColumn(modifier = Modifier.padding(8.dp)) {
        groupedTopics.forEach { (category, topics) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
            }
            items(topics) {
                TopicItem(topic = it, viewModel = viewModel)
            }
        }
    }
}

@Composable
fun TopicItem(topic: FirstAidTopic, viewModel: FirstAidViewModel) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { expanded = !expanded },
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = topic.title, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
            if (expanded) {
                Text("Cómo actuar:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                topic.howToAct.forEach {
                    Text(text = "• $it")
                }

                Text("Qué no hacer:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                topic.whatNotToDo.forEach {
                    Text(text = "• $it")
                }

                IconButton(onClick = { viewModel.toggleFavorite(topic.id) }) {
                    Icon(
                        imageVector = if (topic.isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                        contentDescription = "Favorite"
                    )
                }
            }
        }
    }
}

@Composable
fun SearchScreen(viewModel: FirstAidViewModel) {
    val searchText by viewModel.searchText.collectAsState()
    val filteredTopics by viewModel.filteredTopics.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = searchText,
            onValueChange = viewModel::onSearchTextChanged,
            label = { Text("Buscar emergencia") },
            modifier = Modifier.fillMaxWidth()
        )

        LazyColumn(modifier = Modifier.padding(top = 16.dp)) {
            items(filteredTopics) {
                TopicItem(topic = it, viewModel = viewModel)
            }
        }
    }
}

@Composable
fun FavoritesScreen(viewModel: FirstAidViewModel) {
    val favoriteTopics = viewModel.getFavorites()

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(favoriteTopics) {
            TopicItem(topic = it, viewModel = viewModel)
        }
    }
}

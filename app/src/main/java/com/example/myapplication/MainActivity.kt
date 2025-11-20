package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.data.FavoritesRepository
import com.example.myapplication.data.FirstAidRepositoryImpl
import com.example.myapplication.data.FirstAidTopic
import com.example.myapplication.ui.FirstAidViewModel
import com.example.myapplication.ui.FirstAidViewModelFactory
import com.example.myapplication.ui.theme.MyApplicationTheme

sealed class BottomNavItem(val route: String, val icon: ImageVector, val title: String) {
    object Home : BottomNavItem("home", Icons.Default.Home, "Home")
    object Search : BottomNavItem("search", Icons.Default.Search, "Buscar")
    object Favorites : BottomNavItem("favorites", Icons.Default.Favorite, "Favoritos")
    object Emergency : BottomNavItem("emergency", Icons.Default.Call, "Llamadas")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MyApplication)
        super.onCreate(savedInstanceState)

        val favoritesRepository = FavoritesRepository(this)
        val viewModelFactory = FirstAidViewModelFactory(FirstAidRepositoryImpl(), favoritesRepository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(FirstAidViewModel::class.java)

        setContent {
            MyApplicationTheme {
                MainScreen(viewModel = viewModel)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: FirstAidViewModel) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Primeros Auxilios App") }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            AppNavigation(navController = navController, viewModel = viewModel)
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Favorites,
        BottomNavItem.Emergency
    )
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Composable
fun AppNavigation(navController: NavHostController, viewModel: FirstAidViewModel) {
    NavHost(navController = navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable(BottomNavItem.Search.route) {
            SearchScreen(navController = navController, viewModel = viewModel)
        }
        composable(BottomNavItem.Favorites.route) {
            FavoritesScreen(navController = navController, viewModel = viewModel)
        }
        composable(BottomNavItem.Emergency.route) {
            EmergencyScreen()
        }
        composable("topic_detail/{topicId}") { backStackEntry ->
            val topicId = backStackEntry.arguments?.getString("topicId")
            val topics by viewModel.topics.collectAsState()
            val topic = topics.find { it.id == topicId }
            if (topic != null) {
                com.example.myapplication.ui.TopicDetailScreen(topic = topic, viewModel = viewModel)
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController, viewModel: FirstAidViewModel) {
    val topics by viewModel.topics.collectAsState()
    val groupedTopics = topics.groupBy { it.category }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        groupedTopics.forEach { (category, topicsInCategory) ->
            item(span = { GridItemSpan(maxLineSpan) }) {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 8.dp)
                )
            }
            items(items = topicsInCategory, key = { it.id }) { topic ->
                TopicCard(topic = topic) {
                    navController.navigate("topic_detail/${topic.id}")
                }
            }
        }
    }
}

@Composable
fun SearchScreen(navController: NavHostController, viewModel: FirstAidViewModel) {
    val searchText by viewModel.searchText.collectAsState()
    val filteredTopics by viewModel.filteredTopics.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = searchText,
            onValueChange = viewModel::onSearchTextChanged,
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Buscar tema...") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search)
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(filteredTopics) { topic ->
                TopicCard(topic = topic) {
                    navController.navigate("topic_detail/${topic.id}")
                }
            }
        }
    }
}

@Composable
fun FavoritesScreen(navController: NavHostController, viewModel: FirstAidViewModel) {
    val topics by viewModel.topics.collectAsState()
    val favoriteTopics = topics.filter { it.isFavorite }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (favoriteTopics.isEmpty()) {
            item(span = { GridItemSpan(maxLineSpan) }) {
                 Text("No has añadido ningún tema a favoritos.", modifier = Modifier.padding(16.dp))
            }
        } else {
            items(favoriteTopics) { topic ->
                TopicCard(topic = topic) {
                    navController.navigate("topic_detail/${topic.id}")
                }
            }
        }
    }
}

@Composable
fun EmergencyScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("En caso de emergencia, pulsa el botón para llamar.", textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:131")
            }
            context.startActivity(intent)
        }) {
            Icon(Icons.Default.Call, contentDescription = null, modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.size(8.dp))
            Text("Llamar a Ambulancia (131)")
        }
    }
}

fun getTopicColor(topic: FirstAidTopic): Color {
    val title = topic.title.lowercase()
    val category = topic.category

    // Máxima Urgencia (Rojo)
    if (category == "Emergencias Graves" || title.contains("arterial") || title.contains("anafilaxia") || title.contains("paro cardiorrespiratorio") || title.contains("acv")) {
        return Color(0xFFD32F2F)
    }

    // Urgencia Alta (Naranjo)
    if (category == "Emergencias Respiratorias" || title.contains("grave") || title.contains("abierta") || title.contains("asfixia") || title.contains("electrocución")) {
        return Color(0xFFF57C00)
    }

    // Urgencia Moderada (Amarillo)
    if (title.contains("profundo") || title.contains("moderada") || title.contains("hipoglucemia") || title.contains("conmoción")) {
        return Color(0xFFFBC02D)
    }

    // Leve (Verde)
    return Color(0xFF388E3C)
}


@Composable
fun TopicCard(topic: FirstAidTopic, onClick: () -> Unit) {
    val cardColor = getTopicColor(topic)

    Card(
        modifier = Modifier
            .aspectRatio(1f)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = topic.imageVector,
                contentDescription = topic.title,
                modifier = Modifier.size(40.dp),
                tint = Color.White.copy(alpha = 0.9f)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = topic.title,
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = MaterialTheme.typography.labelSmall.fontSize * 1.1
                )
            }
        }
    }
}

@Composable
fun TopicDetailScreen(topic: FirstAidTopic, viewModel: FirstAidViewModel) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = topic.title,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.weight(1f)
            )
            IconButton(onClick = { viewModel.toggleFavorite(topic.id) }) {
                Icon(
                    imageVector = if (topic.isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "Toggle Favorite",
                    tint = if (topic.isFavorite) Color(0xFFE53935) else MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        
        topic.procedureImage?.let { imageRes ->
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Imagen del procedimiento",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.FillWidth
            )
        }

        Text("Síntomas:", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
        topic.symptoms.forEach { Text("• $it") }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Cómo actuar:", fontWeight = FontWeight.Bold)
        topic.howToAct.forEach { Text("• $it") }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Qué no hacer:", fontWeight = FontWeight.Bold)
        topic.whatNotToDo.forEach { Text("• $it") }
    }
}

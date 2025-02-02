package com.example.myproject.ui.theme.screens.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.R
import com.example.myproject.data.EventViewModel
import com.example.myproject.models.Events
import com.example.myproject.navigation.ROUTE_FIND_EVENTS
import com.example.myproject.navigation.ROUTE_HOME
import com.example.myproject.navigation.ROUTE_HOST_EVENTS
import com.example.myproject.navigation.ROUTE_TICKET_PAYMENT
import com.example.myproject.navigation.ROUTE_USER_PROFILE




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  HomeScreen(navController: NavHostController) {
    Column (modifier = Modifier.fillMaxSize()
        ){


        var query by remember { mutableStateOf("")}
        var active by remember { mutableStateOf(false) }


        SmallTopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.background,
                titleContentColor = MaterialTheme.colorScheme.background,
            ),
            title = {
                Text("Top app Bar")
            },
            navigationIcon = {
                IconButton(onClick = {}) {

                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Localized description"
                    )
                }
            },
            actions = {
                IconButton(onClick = {navController.navigate(ROUTE_USER_PROFILE)}) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Localized description"
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "Localized description"
                    )
                }
            }




        )
        SearchBar(query = query,
            onQueryChange = {query= it},
            onSearch = {newQuery ->
                println("Performing search on query: $newQuery")},
            active = active,
            onActiveChange = {
                active =it
            }) {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center){
                Text(text = "Search for events",
                    color = Color.Black)
            }
        }
Spacer(modifier = Modifier.height(10.dp))


 Text(text = "Welcome to Tiventi where ordering tickets is made easier.",
    fontSize = 20.sp,
    fontFamily = FontFamily.Default,
    color = Color.Black,
    fontWeight = FontWeight.ExtraBold)

    Spacer(modifier = Modifier.height(500.dp))

        BottomAppBar(
            actions = {
                IconButton(onClick = {navController.navigate(ROUTE_HOME) }) {
                    Icon(
                        Icons.Filled.Home,
                        contentDescription = "Home"
                    )
                }
            IconButton(onClick = {navController.navigate(ROUTE_FIND_EVENTS) }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = "Localized description",
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Filled.Star,
                        contentDescription = "Localized description",
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Filled.DateRange,
                        contentDescription = "Localized description",
                    )
                }

            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { navController.navigate(ROUTE_HOST_EVENTS) },
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Icon(Icons.Filled.Add, "Localized description")
                }
            }
        )

    }
}




fun <T> mutableStateOf(): MutableState<T> {
    TODO("Not yet implemented")
}






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}


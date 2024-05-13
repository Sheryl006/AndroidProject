package com.example.myproject.ui.theme.screens.profile

//import androidx.compose.foundation.MutatePriority
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.*
//import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.unit.dp
//import androidx.room.util.copy
//import com.example.myproject.models.User
//import java.lang.reflect.Modifier
//
//
//@Composable
//fun ProfileEditScreen(user: User, onSave: (User) -> Unit) {
//    var name by remember { mutableStateOf(user.name) }
//    var email by remember { mutableStateOf(user.email) }
//    var bio by remember { mutableStateOf(user.bio) }
//    var KeyboardType by remember {
//        mutableStateOf("")
//    }
//    Column(modifier = Modifier.padding(16.dp)) {
//        Text(text = "Edit Profile", style = MaterialTheme.typography.headlineMedium)
//        Spacer(modifier = Modifier.height(15.dp))
//        TextField(
//            value = name,
//            onValueChange = { name = it },
//            label = { Text("Name") }
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        TextField(
//            value = email,
//            onValueChange = { email = it },
//            label = { Text("Email") },
//            keyboardOptions = MutatePriority.Default.copy(keyboardType = KeyboardType.Email)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        TextField(
//            value = bio,
//            onValueChange = { bio = it },
//            label = { Text("Bio") },
//            maxLines = 3
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(
//            onClick = { onSave(User(name, email, bio)) },
//            modifier = Modifier.align(Alignment.CenterHorizontally)
//        ) {
//            Text(text = "Save")
//        }
//    }
//}
//
//
//
////private fun <KeyboardOptions> MutatePriority.copy(keyboardType: Any): KeyboardOptions {
////
////}
//
//

package com.example.myproject.ui.theme.screens.tickets

import android.app.usage.UsageEvents
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController



@Composable
fun TicketPayment(navController:NavHostController,event: UsageEvents.Event) {
    var name by remember { mutableStateOf("") }
    var phoneNumber by remember {
        mutableStateOf("")
    }
    var ticketQuantity by remember { mutableStateOf(1)}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "Billing details",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
            
        )
        OutlinedTextField(value =name, onValueChange = {name=it},
            label = { Text(text = "Enter your full name") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )

        OutlinedTextField(value =name, onValueChange = {name=it},
            label = { Text(text = "Enter your email") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )
        Text(
            text = "Pay using Mpesa",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
        )


        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text("Mpesa Phone number") }

//
        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedButton(onClick = { initiatePayment(event, phoneNumber, ticketQuantity) },
            modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "Purchase Tickets")
        }
    }
}

fun initiatePayment(event: UsageEvents.Event, phoneNumber: String, ticketQuantity: Int) {

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TicketPaymentPreview(){
    TicketPayment(rememberNavController(), event = UsageEvents.Event())
}
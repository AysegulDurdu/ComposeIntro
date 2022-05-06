package com.example.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    //Column, Row, Box
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomText(text = "Hello Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello World")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Kotlin")
        Spacer(modifier = Modifier.padding(5.dp))
        
        Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
            CustomText(text = "Text1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Text2")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Text3")

        }
    }

}

@Composable
fun CustomText(text: String) {
    Text(modifier = Modifier
        .clickable {
            println("Hello Android clicked")
        }
        .background(color = Color.Black)
        .padding(top = 10.dp, start = 2.dp, end = 2.dp, bottom = 20.dp),
        //.width(150.dp),
        //.fillMaxSize(0.5f),
        text = text,
        color = Color.White,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
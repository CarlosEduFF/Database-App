package com.example.appaula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appaula.ui.theme.AppAulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppAulaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    Column(
        Modifier
            .background(Color.White)
    ){
    Row(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
        ,Arrangement.Center
    ){
        val offset = Offset(5.0f, 10.0f)
        Text(text = "App",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Blue, offset = offset, blurRadius = 3f
                )
            )
        )
    }
        Divider(
            Modifier.height(20.dp),
            color =  Color.Transparent
        )
        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth()
            , Arrangement.SpaceBetween, Alignment.CenterVertically
        ){
            Column(

            ) {
                Text(text = "Carlos Eduardo Fernandes", )
            }
            Column() {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Editar")
                }
            }
            Column() {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Excluir")
                }
            }
        }
        Row (
            Modifier
                .padding(8.dp)
        ){

        }
        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(), Arrangement.SpaceBetween, Alignment.CenterVertically
        ){
            Column() {
                Text(text = "Carlos Eduardo Fernandes" )
            }
            Column() {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Editar")
                }
            }
            Column() {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Excluir")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewApp(){
    AppAulaTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}
package com.example.mpapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mpapp.ui.theme.MPappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MPappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                GreetingText(pesan = "Happy Graduation Anny!!",
                            teks = "Selamat atas Expert yang telah di raih,Semoga kelak menjadiorang yang sukses",
                            pengirim = "Pengirim Agil")
                }
            }
        }
    }
}

@Composable
fun GreetingText(pesan : String, teks : String, pengirim : String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Top,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = pesan,
            fontSize = 65.sp,
            lineHeight = 52.sp,
            textAlign = TextAlign.Center
        )
    }
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = teks,
            fontSize = 45.sp,
            lineHeight = 52.sp,
            textAlign = TextAlign.Center
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom
    ){
        Text(
            text = pengirim,
            fontSize = 28.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
            )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MPappTheme {
        GreetingText("Happy Graduation Anny!!",
            teks = "Selamat atas Expert yang telah di raih,Semoga kelak menjadiorang yang sukses",
            pengirim = "Pengirim Agil")
    }
}
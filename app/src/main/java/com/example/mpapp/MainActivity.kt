package com.example.mpapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                GreetingImage(pesan = "Happy Graduation Anny!!",
                            teks = stringResource(R.string.Selamat),
                            pengirim = stringResource(R.string.Starboy)
                )
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
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = teks,
            fontSize = 45.sp,
            lineHeight = 52.sp,
            textAlign = TextAlign.Center
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = pengirim,
            fontSize = 28.sp,
            )
    }
}

@Composable
fun GreetingImage(pesan : String, teks : String, pengirim : String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxSize(),
            alpha = 0.9F,
            contentScale = ContentScale.Crop
        )
        GreetingText(pesan = pesan,
            teks = teks,
            pengirim = pengirim,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MPappTheme {
        GreetingImage(pesan = "Happy Graduation Anny!!",
            teks = stringResource(R.string.Selamat),
            pengirim = stringResource(R.string.Starboy))
    }
}
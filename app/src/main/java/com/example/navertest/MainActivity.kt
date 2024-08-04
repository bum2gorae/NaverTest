package com.example.navertest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.fragment.app.FragmentActivity
import com.example.navertest.ui.theme.NaverTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NaverTestTheme {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(150.dp)){
                    val contextAct = LocalContext.current as Activity?
                    Button(onClick = {
                        val intent = Intent(contextAct, MapFragActivity::class.java)
                        contextAct?.startActivity(intent)
                    }) {
                        Text(text = "start")
                    }
                }

            }
        }
    }
}

@Composable
fun MapScreen(activity: FragmentActivity) {
    Box(modifier = Modifier.fillMaxSize()) {

    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NaverTestTheme {
//        MapScreen()
//    }
//}
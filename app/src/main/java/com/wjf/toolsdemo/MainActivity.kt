package com.wjf.toolsdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wjf.toolsdemo.ui.nav.MyNavHost
import com.wjf.toolsdemo.ui.theme.ToolsDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToolsDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavHost()
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

}

@Preview(showBackground = true, widthDp = 1080, heightDp = 1920)
@Composable
fun DefaultPreview() {
    ToolsDemoTheme {
        Greeting()
    }
}
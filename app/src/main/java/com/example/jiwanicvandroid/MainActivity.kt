package com.example.jiwanicvandroid

import Greeting
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.ui.theme.JiwaniCVAndroidTheme
import home.CVHome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JiwaniCVAndroidTheme {
                CVHome()
            }
        }
    }
}

package com.tamzi.jettheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.tamzi.jettheming.ui.theming.JetThemingTheme

import com.tamzi.jettheming.ui.theming.components.HeadingText
import com.tamzi.jettheming.ui.theming.white

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetThemingTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = white) {
                    HeadingText("Android")
                }
            }
        }
    }
}


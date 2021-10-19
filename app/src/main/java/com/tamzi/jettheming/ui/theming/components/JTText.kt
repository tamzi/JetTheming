package com.tamzi.jettheming.ui.theming.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tamzi.jettheming.ui.theming.JetThemingTheme

@Composable
fun HeadingText(headingText: String) {
    Text(text = "$headingText!")
}


@Composable
fun Greeting(s: String) {

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetThemingTheme {
        Greeting("Android")
    }
}

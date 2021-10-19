package com.tamzi.jettheming.ui.theming.components

import android.graphics.Color
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.tamzi.jettheming.ui.theming.Purple200
import com.tamzi.jettheming.ui.theming.black

@Preview
@Composable
fun JTCard (){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable{ },
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(fontWeight = FontWeight.W900,
                        color = black)
                    ) {
                        append("Card title")
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    append("Now you are in the ")
                    withStyle(
                        style = SpanStyle(fontWeight = FontWeight.W900)
                    )
                    {
                        append("Card")
                    }
                    append(" desccription section")
                }
            )
        }
    }

}
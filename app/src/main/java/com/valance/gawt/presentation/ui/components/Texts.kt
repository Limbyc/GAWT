package com.valance.gawt.presentation.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun MainTitleText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 32.sp,
        color = color,
        textAlign = TextAlign.Center,
        lineHeight = 40.sp
    )
}

@Composable
fun LogInText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 24.sp,
        color = color,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun LogInScreenText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 16.sp,
        color = color,
        textAlign = TextAlign.Center
    )
}
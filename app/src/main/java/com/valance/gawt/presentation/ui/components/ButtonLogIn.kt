package com.valance.gawt.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonLogIn(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(0.dp, 30.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = color)
            .clickable { onClick() },
        contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            modifier = modifier.padding(0.dp, 12.dp),
            text = text,
            fontSize = 18.sp,
            color = Color.White
        )
    }
}

@Composable
@Preview
fun ButtonLogInPreview(){
    ButtonLogIn(text = "Войти", color = Color.Blue, onClick = {})
}
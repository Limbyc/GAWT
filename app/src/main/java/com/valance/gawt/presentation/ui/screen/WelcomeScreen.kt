package com.valance.gawt.presentation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valance.gawt.R
import com.valance.gawt.presentation.ui.components.ButtonLogIn
import com.valance.gawt.presentation.ui.components.MainTitleText

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = modifier.height(20.dp))

        MainTitleText(
            text = stringResource(R.string.main_text),
            color = colorResource(R.color.main_blue)
        )

        Spacer(modifier = modifier.weight(0.8f))

        Image(painter = painterResource(R.drawable.logo), contentDescription = null)

        Spacer(modifier = modifier.weight(1.0f))

        ButtonLogIn(
            text = stringResource(R.string.log_in),
            color = colorResource(R.color.main_blue),
            onClick = onClick
        )
    }
}

@Preview
@Composable
fun WelcomeScreenPreview(){
    WelcomeScreen(onClick = {})
}
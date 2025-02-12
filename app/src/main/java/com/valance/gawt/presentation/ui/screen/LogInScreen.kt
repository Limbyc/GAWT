package com.valance.gawt.presentation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.valance.gawt.R
import com.valance.gawt.presentation.ui.components.ButtonLogIn
import com.valance.gawt.presentation.ui.components.InputText
import com.valance.gawt.presentation.ui.components.LogInScreenText
import com.valance.gawt.presentation.ui.components.LogInText

@Composable
fun LogInScreen(modifier: Modifier = Modifier,
                onClick: () -> Unit)
{
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.main_blue))
            .padding(16.dp),
    )
    {
        LogInText(
            modifier = modifier
                .padding(top = 120.dp)
                .align(Alignment.CenterHorizontally),
            text = stringResource(R.string.log_in_text),
            color = Color.White,
        )

        LogInScreenText(
            modifier = modifier.padding(top = 80.dp, bottom = 8.dp),
            text = stringResource(R.string.user_login),
            color = Color.White
        )

        InputText(label = stringResource(R.string.user_enter_login))

        LogInScreenText(
            modifier = modifier.padding(top = 16.dp, bottom = 8.dp),
            text = stringResource(R.string.user_password),
            color = Color.White
        )

        InputText(label = stringResource(R.string.user_enter_password))

        Spacer(modifier = modifier.height(30.dp))

        ButtonLogIn(
            text = stringResource(R.string.log_in),
            color = colorResource(R.color.yellow),
            onClick = onClick
        )

        Text(
            modifier = modifier
                .fillMaxWidth()
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = {  }
                ),
            text = stringResource(R.string.forgot_password),
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }

}

@Composable
@Preview
fun LogInScreenPreview() {
    LogInScreen(onClick = {})
}
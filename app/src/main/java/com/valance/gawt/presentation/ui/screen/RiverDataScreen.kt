package com.valance.gawt.presentation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.valance.gawt.R
import com.valance.gawt.presentation.ui.components.ButtonLogIn
import com.valance.gawt.presentation.ui.components.InputText

@Composable
fun RiverDataScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.TopCenter
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorResource(R.color.main_blue))
                    .padding(16.dp, 30.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(32.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                        ) {
                            navController.navigate("river")
                        },
                    painter = painterResource(R.drawable.left_arrow),
                    contentDescription = null
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "река Днепр", //TODO сделать чтобы из бд
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.weight(1f))
            }
        }

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp, 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = stringResource(R.string.commission),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
            )

            val inputLabels = listOf(
                R.string.gawt to "Иванов А.И.",
                R.string.vvp to "Введите представителя",
                R.string.birs to "Введите представителя",
                R.string.additional_commission to "Введите представителя"
            )

            inputLabels.forEach { (labelResId, inputLabel) ->
                Column(modifier = modifier) {
                    Text(
                        modifier = modifier.padding(top = 12.dp),
                        text = stringResource(labelResId)
                    )
                    Spacer(modifier = modifier.height(12.dp))

                    InputText(label = inputLabel)
                }
            }

            Spacer(modifier = modifier.height(30.dp))

            ButtonLogIn(
                text = stringResource(R.string.save),
                color = colorResource(R.color.yellow),
                onClick = {})
        }


    }
}

@Preview
@Composable
fun RiverDataScreenPreview() {
    val navController = rememberNavController()
    RiverDataScreen(navController = navController)
}
package com.valance.gawt.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.valance.gawt.R

@Composable
fun StaggeredGridButtonLayout(
    navController: NavController,
    modifier: Modifier = Modifier,
    buttonTexts: List<Int>,
    color: Color
) {
    Row(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val firstAndThirdButtons = buttonTexts.filterIndexed { index, _ -> index == 0 || index == 2 }
        val secondButton = buttonTexts.filterIndexed { index, _ -> index == 1 }

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            firstAndThirdButtons.forEach { resId ->
                Button(
                    onClick = {
                        when (resId) {
                            R.string.enterdata -> navController.navigate("staff_data")
                            R.string.startwork -> {}
                            R.string.endwork -> {}
                            R.string.startcheck -> navController.navigate("map")
                            R.string.enterdataa -> navController.navigate("river_data")
                            else -> {
                            }
                        }
                    },
                    modifier = Modifier
                        .size(width = 150.dp, height = 170.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = color,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = stringResource(id = resId),
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            secondButton.forEach { resId ->
                Button(
                    onClick = {
                        when (resId) {
                            R.string.enterdata -> navController.navigate("staff_data")
                            R.string.startwork -> {
                                // Логика для "Начать работу"
                            }
                            R.string.endwork -> {
                                // Логика для "Закончить работу"
                            }
                            else -> {
                                // Обработка других кнопок (если нужно)
                            }
                        }
                    },
                    modifier = Modifier
                        .size(width = 150.dp, height = 348.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = color,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = stringResource(id = resId),
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StaggeredGridButtonLayoutPreview() {
    StaggeredGridButtonLayout(
        buttonTexts = listOf(R.string.startwork, R.string.endwork, R.string.enterdata), // Пример передачи ресурсов строк
        color = colorResource(R.color.main_blue),
        navController = rememberNavController()
    )
}




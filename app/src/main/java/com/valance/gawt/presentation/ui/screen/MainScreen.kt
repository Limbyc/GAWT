package com.valance.gawt.presentation.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.valance.gawt.presentation.ui.components.ModalNavigationDrawerWrapper

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawerWrapper(
        drawerState = drawerState,
        navController = navController,
        content = {
            Scaffold(
                content = { paddingValues ->
                    Column(
                        modifier = modifier
                            .fillMaxSize()
                            .padding(paddingValues),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                       Text("")
                           /*
                           TODO сделать прасинг новостей с сайта с помощью карточек, а также прасить погоду с сайта погода бай, можно еще что-то придумать
                            */
                    }
                }
            )
        }
    )
}

@Preview
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController = navController )
}

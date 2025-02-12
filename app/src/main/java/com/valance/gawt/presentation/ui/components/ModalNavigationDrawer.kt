package com.valance.gawt.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.valance.gawt.R

@Composable
fun DrawerContent(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .background(colorResource(R.color.main_blue))
                .padding(16.dp, 30.dp)
        ){
            Column {
                Image(
                    painter = painterResource(R.drawable.user),
                    contentDescription = "User icon",
                    modifier = Modifier
                        .size(32.dp)
                        .clickable (
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                        ){
                            navController.navigate("profile")
                        }
                )

                Spacer(modifier = modifier.height(30.dp))

                Text(
                    text = "Специалист Роговой С.А.",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ) //TODO доступ к бд

            }
        }

        Spacer(modifier = modifier.height(16.dp))

        Text(
            text = stringResource(R.string.choose_river),
            color = Color.Gray,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        )

        CardRiver(text = stringResource(R.string.dnepr), onClick = {navController.navigate("river")})
        CardRiver(text = stringResource(R.string.berezyna), onClick = {navController.navigate("river")})
        CardRiver(text = stringResource(R.string.soj), onClick = {navController.navigate("river")})
        CardRiver(text = stringResource(R.string.prypyat), onClick = {navController.navigate("river")})
    }
}



@Composable
fun ModalNavigationDrawerWrapper(
    drawerState: DrawerState,
    content: @Composable () -> Unit,
    navController: NavHostController
) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(LocalDensity.current.run { (LocalConfiguration.current.screenWidthDp * 0.8).dp })
                    .padding(0.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                DrawerContent(navController = navController)
            }
        },
        content = { content() },
        modifier = Modifier.fillMaxSize(),
    )
}






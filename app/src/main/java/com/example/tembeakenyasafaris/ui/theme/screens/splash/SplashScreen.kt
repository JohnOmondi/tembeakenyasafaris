package com.example.tembeakenyasafaris.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.tembeakenyasafaris.R
import com.example.tembeakenyasafaris.navigation.ROUT_HOME
import com.example.tembeakenyasafaris.navigation.ROUT_LOGIN
import com.example.tembeakenyasafaris.ui.theme.lightblue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition", "SuspiciousIndentation")
@Composable
fun SplashScreen(navController: NavController){
   Column (
      modifier = Modifier
          .fillMaxSize()
          .background(Color.White),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally

      ){
    var coroutineScope = rememberCoroutineScope()
      coroutineScope.launch {
         delay(4000)
         navController.navigate(ROUT_LOGIN)
      }


       val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.property))
       val progress by animateLottieCompositionAsState(composition)
       LottieAnimation(composition, progress,
           modifier = Modifier.size(300.dp)
       )





   }


}
@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
   SplashScreen(rememberNavController())




}
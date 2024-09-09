package com.example.tembeakenyasafaris.ui.theme.screens.map1

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun MapnairobiScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().height(300.dp)){
        val mUrl = "https://maps.app.goo.gl/PL5SP6cvVk4AmLC87"

        AndroidView(factory = {
            WebView(it).apply {
                settings.javaScriptEnabled=true

                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = WebViewClient()
                loadUrl(mUrl)
            }
        }, update = { it.loadUrl(mUrl) })

    }




}
@Composable
@Preview(showBackground = true)
fun MapnairobiScreenPreview(){
    MapnairobiScreen(rememberNavController())
}
package com.example.tembeakenyasafaris.ui.theme.screens.nairobinationalpark

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tembeakenyasafaris.R
import com.example.tembeakenyasafaris.navigation.ADD_PRODUCTS_URL
import com.example.tembeakenyasafaris.ui.theme.lightblue
import com.example.tembeakenyasafaris.ui.theme.redbrown


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NairobiparkScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Tembea Kenya Safaris ") },
                    colors = TopAppBarDefaults.mediumTopAppBarColors()
                )
            },



            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 60.dp)
                ){


                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                            .verticalScroll(rememberScrollState())
                    ) {







                        Row (modifier = Modifier
                            .padding(start = 5.dp)
                            .horizontalScroll(rememberScrollState())){
                            //Card1
                            Card ()
                            {

                                Box(
                                    modifier = Modifier
                                        .height(220.dp)
                                        .width(200.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home1) ,
                                        contentDescription ="home",
                                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                                    )




                                }


                            }
                            Spacer(modifier = Modifier.width(5.dp))


                            Card ()
                            {

                                Box(
                                    modifier = Modifier
                                        .height(220.dp)
                                        .width(200.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2) ,
                                        contentDescription ="home",
                                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                                    )




                                }


                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            Card ()
                            {

                                Box(
                                    modifier = Modifier
                                        .height(220.dp)
                                        .width(200.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home3) ,
                                        contentDescription ="home",
                                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                                    )




                                }


                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            Card ()
                            {

                                Box(
                                    modifier = Modifier
                                        .height(220.dp)
                                        .width(200.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home4) ,
                                        contentDescription ="home",
                                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                                    )




                                }


                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            Card ()
                            {

                                Box(
                                    modifier = Modifier
                                        .height(220.dp)
                                        .width(200.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home5) ,
                                        contentDescription ="home",
                                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                                    )




                                }


                            }
                            Spacer(modifier = Modifier.width(5.dp))


                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(700.dp)
                                .verticalScroll(rememberScrollState())

                            ,
                            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp), colors = CardDefaults.cardColors(
                                lightblue)
                        ) {
                            Text(
                                text ="Nairobi National Park",
                                fontSize = 45.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,

                                )

                            Text(
                                text ="Tour; Nairobi National Park",
                                fontSize = 25.sp,
                                color = Color.Black

                            )
                            Row {
                                Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
                                Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
                                Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
                                Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
                                Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))


                            }

                            Text(
                                text = "A short drive out of Nairobi’s central business district is the Nairobi National Park. Wide open grass plains and backdrop of the city scrapers, scattered acacia bush play host to a wide variety of wildlife including the endangered black rhino, lions, leopards, cheetahs, hyenas, buffaloes, giraffes and diverse birdlife with over 400 species recorded. Visitors can enjoy the park’s picnic sites, three campsites and the walking trails for hikers.",
                                modifier = Modifier.padding(10.dp))

                            Spacer(modifier = Modifier.height(10.dp))




                           Column(modifier = Modifier.fillMaxWidth().height(300.dp)){
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
                            Spacer(modifier = Modifier.height(30.dp))

                            Button(
                                onClick = { navController.navigate(ADD_PRODUCTS_URL) },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(start = 20.dp, end = 20.dp),
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RoundedCornerShape(10.dp)

                            ) {

                                Text(
                                    text = "Book now!!!!for 12000",
                                    fontSize = 21.sp

                                )

                            }

                            Spacer(modifier = Modifier.height(30.dp))




                        }












                    }






                }

            }

        )






    }




}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="detail",
        selectedIcon= Icons.Filled.Home,
        unselectedIcon= Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Contact Us",
        route="us",
        selectedIcon= Icons.Filled.Call,
        unselectedIcon= Icons.Outlined.Call,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "map",
        route="mapnairobi",
        selectedIcon= Icons.Filled.LocationOn,
        unselectedIcon= Icons.Outlined.LocationOn,
        hasNews = true,
        badges=1
    ),

    BottomNavItem(
        title = "My Bookings",
        route="view_products",
        selectedIcon= Icons.Filled.ShoppingCart,
        unselectedIcon= Icons.Outlined.ShoppingCart,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)





@Composable
@Preview(showBackground = true)
fun NairobiparkScreenPreview() {
    NairobiparkScreen(rememberNavController())}









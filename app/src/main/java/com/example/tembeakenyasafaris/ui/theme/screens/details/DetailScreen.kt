package com.example.tembeakenyasafaris.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tembeakenyasafaris.R
import com.example.tembeakenyasafaris.navigation.ROUT_AMBOSELI
import com.example.tembeakenyasafaris.navigation.ROUT_BOMAS
import com.example.tembeakenyasafaris.navigation.ROUT_DETAIL
import com.example.tembeakenyasafaris.navigation.ROUT_ELEMENTAITA
import com.example.tembeakenyasafaris.navigation.ROUT_LAKENAIVASHA
import com.example.tembeakenyasafaris.navigation.ROUT_MAASAIMARA
import com.example.tembeakenyasafaris.navigation.ROUT_MOUNTKENYA
import com.example.tembeakenyasafaris.navigation.ROUT_NAIROBIPARK
import com.example.tembeakenyasafaris.navigation.ROUT_TSAVO
import com.example.tembeakenyasafaris.ui.theme.lightblue
import com.example.tembeakenyasafaris.ui.theme.redbrown


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        TopAppBar(
            title = { Text(text = "Tembea Kenya Safaris")},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {

                IconButton(onClick = { /* TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription ="menu", tint = Color.White )

                }
            },
           actions = {

               IconButton(onClick = { /*TODO*/ }) {
                   Icon(imageVector = Icons.Default.Notifications, contentDescription ="notification", tint = Color.White )

               }


           }

        )


        Box(
            modifier = Modifier
                .height(220.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
          Image(
              painter = painterResource(id = R.drawable.tour) ,
              contentDescription ="home",
              modifier = Modifier.fillMaxSize(),
              contentScale = ContentScale.Crop
              )


        }
        Row {
            Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription ="star" , tint = redbrown ,modifier = Modifier.size(30.dp))


        }


        Spacer(modifier = Modifier.height(10.dp))
//search bar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search ,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder = {Text(text = "What's your Destination")}


            )


        Text(
            text ="DESTINATIONS",
            fontSize = 30.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold)

        Spacer(modifier = Modifier.height(5.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nai1) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_NAIROBIPARK) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Nairobi National Park",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }

        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ambo1) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_AMBOSELI) },
                    contentScale = ContentScale.Crop
                )

                Text(
                    text ="Amboseli National Park",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }

        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ambo3) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_MAASAIMARA) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Maasai Mara Resrve",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }

        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lake) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_LAKENAIVASHA) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Lake Naivasha",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }
        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bomas1) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_BOMAS) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Bomas of Kenya",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }
        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.elementaita) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_ELEMENTAITA) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Lake Elementaita",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }
        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mountkenya) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_MOUNTKENYA) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Mount Kenya",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }



        Spacer(modifier = Modifier.height(10.dp))




        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ambo2) ,
                    contentDescription ="home",
                    modifier = Modifier.fillMaxSize().clickable {  navController.navigate(
                        ROUT_TSAVO) },
                    contentScale = ContentScale.Crop
                )
                Text(
                    text ="Tsavo National Park",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )

            }

        }











    }


















    }


@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())




}

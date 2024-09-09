package com.example.tembeakenyasafaris.ui.theme.screens.us

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun UsScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text ="About us",
            fontSize = 45.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,

            )


        Text(
            text = "SERVICE DELIVERY\n" +
                    "\n" +
                    "We shall provide our customers with:\n" +
                    "\n" +
                    "*High quality and secure parks.\n" +
                    "\n" +
                    "*Wildlife conservation education - publication and information about wildlife in a form suitable for and accessible to all.\n" +
                    "\n" +
                    "*Sustainable wildlife population.\n" +
                    "\n" +
                    "*Protection of agriculture and animal husbandry against destruction of wildlife.\n" +
                    "\n" +
                    "*Data and information service to scientific, advisory and consultancy organizations involved in wildlife conservation.\n" +
                    "\n" +
                    "*Professional services in a friendly, responsive and professional environment.",
            modifier = Modifier.padding(10.dp),
                    fontSize = 20.sp,
                    color = Color.Black
        )




        Card (  modifier = Modifier
            .fillMaxWidth()
            .height(700.dp)
            .verticalScroll(rememberScrollState())
        ){
            Text(
                text ="Contact us ",
                fontSize = 35.sp,
                color = Color.Black)


            Text(text = "© 2021 Tembea Kenya Safaris , All Rights Reserved | P.O. Box 40241 - 00100, Nairobi Kenya | CONTACT CENTRE (Toll Free):0800 597 000 , +254726610533 (GUEST HOUSE RESERVATIONS) Tel: +254 726610508/509, +254 20-2379407-408/409/410/411/412/414/415, +254 20-2609233, +254 20-2609234, +254 735663421, +254 736663400 |\n" +
                    "Email Address: Tembeakenyasafaris@gmail.com\n" +
                    "\n" +
                    "Feedback\n",
                modifier = Modifier.padding(10.dp),
                fontSize = 20.sp,
                color = Color.Black





                )





        }












    }






}
@Composable
@Preview(showBackground = true)
fun UsScreenPreview(){
    UsScreen(rememberNavController())
}
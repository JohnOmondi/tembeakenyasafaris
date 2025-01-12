package com.example.tembeakenyasafaris.ui.theme.screens.login

import android.text.style.TtsSpan.CardinalBuilder
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tembeakenyasafaris.R
import com.example.tembeakenyasafaris.data.AuthViewModel
import com.example.tembeakenyasafaris.navigation.ROUT_DETAIL
import com.example.tembeakenyasafaris.navigation.ROUT_HOME
import com.example.tembeakenyasafaris.navigation.ROUT_LOGIN
import com.example.tembeakenyasafaris.navigation.ROUT_SIGNUP
import com.example.tembeakenyasafaris.ui.theme.lightblue


@Composable
fun LoginScreen(navController: NavController){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }



    Column ( modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Image(
            painter = painterResource(id = R.drawable.login) ,
            contentDescription ="home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )
        Card (

            modifier = Modifier
                .fillMaxWidth()
                .height(700.dp)
                .verticalScroll(rememberScrollState()),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp), colors = CardDefaults.cardColors(
                Color.White)


            ){
            Text(
                text ="Welcome to Kenya",
                fontSize = 60.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text ="Already have an account.please enter your credentials",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)



                var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }



            OutlinedTextField(value = email, onValueChange = {email =it},
                label = { Text("Enter Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                leadingIcon ={ Icon(imageVector = Icons.Default.Email, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


            )

            OutlinedTextField(value = password, onValueChange = {password =it},
                label = { Text("Enter password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                leadingIcon ={ Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()


            )

            Spacer(modifier = Modifier.height(20.dp))
            val context = LocalContext.current
            val authViewModel = AuthViewModel(navController, context)


            Button(
                onClick = {authViewModel.login(email, password)},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(10.dp)



            ) {

                Text(
                    text = "login",
                    fontSize = 21.sp

                )

            }

            Spacer(modifier = Modifier.height(20.dp))


            Text(text = "Do not have an account!",  modifier = Modifier.padding(start = 20.dp))

            TextButton(onClick = { navController.navigate(ROUT_SIGNUP)}) {


                Text(
                    text ="REGISTER HERE",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center)

            }



            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Image(
                    painter = painterResource(id = R.drawable.facebook) ,
                    contentDescription ="home",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { }

                )

                Image(
                    painter = painterResource(id = R.drawable.whatsapp) ,
                    contentDescription ="home",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { }

                )

                Image(
                    painter = painterResource(id = R.drawable.twitter) ,
                    contentDescription ="home",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { }

                )








            }
            Spacer(modifier = Modifier.height(10.dp))






        }


    }


















}
@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())




}
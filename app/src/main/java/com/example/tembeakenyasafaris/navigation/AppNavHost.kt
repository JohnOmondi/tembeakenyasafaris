package com.example.tembeakenyasafaris.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tembeakenyasafaris.ui.theme.property.PropertyScreen
import com.example.tembeakenyasafaris.ui.theme.screens.about.AboutScreen
import com.example.tembeakenyasafaris.ui.theme.screens.amboseli.AmboseliScreen
import com.example.tembeakenyasafaris.ui.theme.screens.bomasofkenya.BomasScreen
import com.example.tembeakenyasafaris.ui.theme.screens.details.DetailScreen
import com.example.tembeakenyasafaris.ui.theme.screens.elementaita.ElementaitaScreen
import com.example.tembeakenyasafaris.ui.theme.screens.gameparks.TsavoScreen
import com.example.tembeakenyasafaris.ui.theme.screens.home.HomeScreen
import com.example.tembeakenyasafaris.ui.theme.screens.lakenaivasha.LakenaivashaScreen
import com.example.tembeakenyasafaris.ui.theme.screens.splash.SplashScreen
import com.example.tembeakenyasafaris.ui.theme.screens.login.LoginScreen
import com.example.tembeakenyasafaris.ui.theme.screens.map1.MapamboseliScreen
import com.example.tembeakenyasafaris.ui.theme.screens.map1.MapbomasScreen
import com.example.tembeakenyasafaris.ui.theme.screens.map1.MaplakeScreen
import com.example.tembeakenyasafaris.ui.theme.screens.map1.MapmaasaiScreen
import com.example.tembeakenyasafaris.ui.theme.screens.map1.MapnairobiScreen
import com.example.tembeakenyasafaris.ui.theme.screens.masaimara.MaasaimaraScreen
import com.example.tembeakenyasafaris.ui.theme.screens.mountkenya.MountkenyaScreen
import com.example.tembeakenyasafaris.ui.theme.screens.nairobimuseum.NairobimuseumScreen
import com.example.tembeakenyasafaris.ui.theme.screens.nairobinationalpark.NairobiparkScreen
import com.example.tembeakenyasafaris.ui.theme.screens.products.AddProductsScreen
import com.example.tembeakenyasafaris.ui.theme.screens.products.ViewProductsScreen
import com.example.tembeakenyasafaris.ui.theme.screens.signup.SignupScreen
import com.example.tembeakenyasafaris.ui.theme.screens.us.UsScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }



        composable(ROUT_PROPERTY) {
            PropertyScreen(navController = navController)
        }


        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)

        }

        composable(ROUT_NAIROBIPARK) {
            NairobiparkScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }


        composable(ROUT_AMBOSELI) {
            AmboseliScreen(navController = navController)
        }

        composable(ROUT_MAPNAIROBI) {
            MapnairobiScreen(navController = navController)
        }
        composable(ROUT_NAIROBIMUSEUM) {
            NairobimuseumScreen(navController = navController)
        }
        composable(ROUT_MAASAIMARA) {
            MaasaimaraScreen(navController = navController)
        }

        composable(ROUT_MAPMAASAI) {
            MapmaasaiScreen(navController = navController)
        }
        composable(ROUT_MAPAMBOSELI) {
            MapamboseliScreen(navController = navController)
        }
        composable(ROUT_US) {
            UsScreen(navController = navController)
        }
        composable(ROUT_LAKENAIVASHA) {
            LakenaivashaScreen(navController = navController)
        }
        composable(ROUT_BOMAS) {
            BomasScreen(navController = navController)
        }

        composable(ROUT_MAPBOMAS) {
            MapbomasScreen(navController = navController)
        }
        composable(ROUT_MAPLAKE) {
            MaplakeScreen(navController = navController)
        }
        composable(ROUT_ELEMENTAITA) {
            ElementaitaScreen(navController = navController)
        }
        composable(ROUT_MOUNTKENYA) {
            MountkenyaScreen(navController = navController)
        }
        composable(ROUT_TSAVO) {
            TsavoScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }



    }


}
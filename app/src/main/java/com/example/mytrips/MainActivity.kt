package br.senai.sp.jandira.mytrips


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mytrips.screens.GreetingHome
import com.example.mytrips.screens.GreetingLogin
import com.example.mytrips.screens.GreetingSignUp
import com.example.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    val controlNavigation = rememberNavController()
                    NavHost(navController = controlNavigation, startDestination = "login") {
                        composable(route = "Login") { GreetingLogin(controlNavigation) }
                        composable(route = "SingUp") { GreetingSignUp(controlNavigation) }
                        composable(route = "Home") { GreetingHome(controlNavigation) }

                    }
                }
            }
        }
    }

}
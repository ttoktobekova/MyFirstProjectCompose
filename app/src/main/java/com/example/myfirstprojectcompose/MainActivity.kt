package com.example.myfirstprojectcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.myfirstprojectcompose.ui.function.ProfileUserScreen
import com.example.myfirstprojectcompose.ui.theme.MyFirstProjectComposeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstProjectComposeTheme {
                ProfileUserScreen()

            }
        }
    }
}

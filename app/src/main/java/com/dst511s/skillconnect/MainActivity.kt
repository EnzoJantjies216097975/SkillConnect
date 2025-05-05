package com.dst511s.skillconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.dst511s.skillconnect.navigation.SkillConnectNavHost
import com.dst511s.skillconnect.ui.theme.SkillConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SkillConnectApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    SkillConnectTheme {
        val navController = rememberNavController()
        SkillConnectNavHost(navController = navController)
    }
}
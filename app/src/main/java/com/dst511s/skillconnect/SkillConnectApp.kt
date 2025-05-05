package com.dst511s.skillconnect

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.dst511s.skillconnect.navigation.SkillConnectNavHost
import com.dst511s.skillconnect.ui.theme.SkillConnectTheme

@Composable
fun SkillConnectApp() {
    SkillConnectTheme {
        val navController = rememberNavController()

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SkillConnectNavHost(navController = navController)
        }
    }
}
package com.dst511s.skillconnect.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dst511s.skillconnect.features.auth.screens.LoginScreen
import com.dst511s.skillconnect.features.auth.screens.RegisterScreen
import com.dst511s.skillconnect.features.auth.screens.UserTypeSelectionScreen
import com.dst511s.skillconnect.features.home.screens.HomeScreen
import com.dst511s.skillconnect.features.jobs.screens.JobDetailScreen
import com.dst511s.skillconnect.features.jobs.screens.JobsScreen
import com.dst511s.skillconnect.features.onboarding.screens.OnboardingScreen
import com.dst511s.skillconnect.features.profile.screens.ProfileScreen
import com.dst511s.skillconnect.features.skills.screens.SkillAssessmentScreen
import com.dst511s.skillconnect.features.workshops.screens.WorkshopsScreen

@Composable
fun SkillConnectNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Onboarding.route,
        modifier = modifier
    ) {
        composable(route = Screen.Onboarding.route) {
            OnboardingScreen(
                onGetStartedClick = { navController.navigate(Screen.Register.route) },
                onLoginClick = { navController.navigate(Screen.Login.route) }
            )
        }

        composable(route = Screen.Login.route) {
            LoginScreen(
                onLoginSuccess = { navController.navigate(Screen.Home.route) },
                onRegisterClick = { navController.navigate(Screen.Register.route) }
            )
        }

        composable(route = Screen.Register.route) {
            RegisterScreen(
                onRegisterSuccess = { navController.navigate(Screen.UserTypeSelection.route) },
                onLoginClick = { navController.navigate(Screen.Login.route) }
            )
        }

        composable(route = Screen.UserTypeSelection.route) {
            UserTypeSelectionScreen(
                onUserTypeSelected = { navController.navigate(Screen.Home.route) }
            )
        }

        composable(route = Screen.Home.route) {
            HomeScreen(
                onNavigateToJobs = { navController.navigate(Screen.Jobs.route) },
                onNavigateToWorkshops = { navController.navigate(Screen.Workshops.route) },
                onNavigateToProfile = { navController.navigate(Screen.Profile.route) }
            )
        }

        composable(route = Screen.Profile.route) {
            ProfileScreen(
                onNavigateBack = { navController.navigateUp() },
                onSkillAssessmentClick = { skillId ->
                    navController.navigate(Screen.SkillAssessment.createRoute(skillId))
                }
            )
        }

        composable(route = Screen.Jobs.route) {
            JobsScreen(
                onJobClick = { jobId ->
                    navController.navigate(Screen.JobDetail.createRoute(jobId))
                },
                onNavigateBack = { navController.navigateUp() }
            )
        }

        composable(route = Screen.JobDetail.route) { backStackEntry ->
            val jobId = backStackEntry.arguments?.getString("jobId") ?: ""
            JobDetailScreen(
                jobId = jobId,
                onNavigateBack = { navController.navigateUp() },
                onApplyClick = { /* Handle job application */ }
            )
        }

        composable(route = Screen.SkillAssessment.route) { backStackEntry ->
            val skillId = backStackEntry.arguments?.getString("skillId") ?: ""
            SkillAssessmentScreen(
                skillId = skillId,
                onNavigateBack = { navController.navigateUp() },
                onAssessmentComplete = { navController.navigate(Screen.Profile.route) }
            )
        }

        composable(route = Screen.Workshops.route) {
            WorkshopsScreen(
                onNavigateBack = { navController.navigateUp() },
                onWorkshopClick = { /* Handle workshop selection */ }
            )
        }
    }
}
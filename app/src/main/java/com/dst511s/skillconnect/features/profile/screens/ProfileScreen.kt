package com.dst511s.skillconnect.features.profile.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dst511s.skillconnect.components.ExperienceContent
import com.dst511s.skillconnect.components.ProjectsContent
import com.dst511s.skillconnect.components.RecommendationItem
import com.dst511s.skillconnect.components.SkillsContent
import com.dst511s.skillconnect.components.profile.ProfileHeader
import com.dst511s.skillconnect.components.profile.ProfileSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    onNavigateBack: () -> Unit,
    onSkillAssessmentClick: (String) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My Profile") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Open settings */ }) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Profile Header
            item {
                ProfileHeader(
                    name = "Tendai Moyo",
                    title = "Computer Science Graduate",
                    location = "Windhoek, Namibia",
                    profileImageUrl = null,
                    profileCompletion = 65
                )
            }

            // Skills Section
            item {
                ProfileSection(
                    title = "Skills",
                    actionIcon = Icons.Outlined.Add,
                    onActionClick = { /* Add skill */ }
                ) {
                    SkillsContent(
                        skills = listOf(
                            com.dst511s.skillconnect.core.data.models.profile.Skill(
                                name = "JavaScript",
                                level = com.dst511s.skillconnect.core.data.models.SkillLevel.INTERMEDIATE,
                                isVerified = true
                            ),
                            com.dst511s.skillconnect.core.data.models.profile.Skill(
                                name = "HTML/CSS",
                                level = com.dst511s.skillconnect.core.data.models.SkillLevel.ADVANCED,
                                isVerified = false
                            ),
                            com.dst511s.skillconnect.core.data.models.profile.Skill(
                                name = "Python",
                                level = com.dst511s.skillconnect.core.data.models.SkillLevel.INTERMEDIATE,
                                isVerified = false
                            ),
                            com.dst511s.skillconnect.core.data.models.profile.Skill(
                                name = "React",
                                level = com.dst511s.skillconnect.core.data.models.SkillLevel.BEGINNER,
                                isVerified = false
                            ),
                            com.dst511s.skillconnect.core.data.models.profile.Skill(
                                name = "UI/UX Design",
                                level = com.dst511s.skillconnect.core.data.models.SkillLevel.INTERMEDIATE,
                                isVerified = false
                            )
                        ),
                        onSkillClick = { skill ->
                            if (!skill.isVerified) {
                                onSkillAssessmentClick(skill.name)
                            }
                        }
                    )
                }
            }

            // Experience Section
            item {
                ProfileSection(
                    title = "Experience",
                    actionIcon = Icons.Outlined.Add,
                    onActionClick = { /* Add experience */ }
                ) {
                    ExperienceContent(
                        experiences = listOf(
                            com.dst511s.skillconnect.core.data.models.profile.Experience(
                                id = "1",
                                company = "TechStartup Namibia",
                                position = "Web Development Intern",
                                location = "Windhoek",
                                startDate = 0,
                                endDate = 0,
                                isCurrentPosition = false,
                                description = "Developed and maintained company website",
                                skills = listOf("HTML", "CSS", "JavaScript"),
                                role = "Web Development Intern",
                                period = "Jan 2024 - Mar 2024",
                                isCurrentRole = false
                            ),
                            com.dst511s.skillconnect.core.data.models.profile.Experience(
                                id = "2",
                                company = "Community Center",
                                position = "IT Support",
                                location = "Windhoek",
                                startDate = 0,
                                endDate = 0,
                                isCurrentPosition = false,
                                description = "Provided technical support to community members",
                                skills = listOf("Customer Service", "Hardware Troubleshooting"),
                                role = "Volunteer IT Support",
                                period = "Oct 2023 - Dec 2023",
                                isCurrentRole = false
                            )
                        )
                    )
                }
            }

            // Projects Section
            item {
                ProfileSection(
                    title = "Projects",
                    actionIcon = Icons.Outlined.Add,
                    onActionClick = { /* Add project */ }
                ) {
                    ProjectsContent(
                        projects = listOf(
                            com.dst511s.skillconnect.core.data.models.profile.Project(
                                id = "1",
                                title = "E-commerce Website",
                                description = "Built a responsive e-commerce site with JavaScript, HTML and CSS",
                                url = "",
                                skills = listOf("JavaScript", "HTML", "CSS"),
                                date = 0,
                                imageUrl = null,
                                imageUrls = emptyList()
                            ),
                            com.dst511s.skillconnect.core.data.models.profile.Project(
                                id = "2",
                                title = "Weather Data Visualization",
                                description = "Created interactive weather data visualizations using Python",
                                url = "",
                                skills = listOf("Python", "Data Visualization"),
                                date = 0,
                                imageUrl = null,
                                imageUrls = emptyList()
                            )
                        )
                    )
                }
            }

            // Recommendations Section
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f)
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Recommendations",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        RecommendationItem(
                            icon = Icons.Default.School,
                            title = "Verify JavaScript Skills",
                            description = "Take a quick assessment to verify your JavaScript skills and stand out to employers.",
                            actionText = "Take Assessment",
                            onClick = { onSkillAssessmentClick("JavaScript") }
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        RecommendationItem(
                            icon = Icons.Default.Book,
                            title = "React Workshop",
                            description = "Join an upcoming React workshop to improve your front-end development skills.",
                            actionText = "View Details",
                            onClick = { /* Navigate to workshop */ }
                        )
                    }
                }
            }

            // Bottom spacing
            item {
                Spacer(modifier = Modifier.height(80.dp))
            }
        }
    }
}
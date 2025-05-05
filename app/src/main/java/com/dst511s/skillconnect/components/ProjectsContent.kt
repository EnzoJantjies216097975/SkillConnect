package com.dst511s.skillconnect.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dst511s.skillconnect.data.models.Project
import com.dst511s.skillconnect.ui.theme.SkillConnectTheme

@Composable
fun ProjectsContent(
    projects: List<Project>
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        projects.forEach { project ->
            ProjectItem(project = project)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProjectsContentPreview() {
    SkillConnectTheme {
        ProjectsContent(
            projects = listOf(
                Project(
                    id = "",
                    title = "E-commerce Website",
                    description = "Built a responsive e-commerce site with JavaScript, HTML and CSS",
                    url = "",
                    imageUrls = emptyList(),
                    skills = emptyList(),
                    date = 0,
                    imageUrl = null
                ),
                Project(
                    id = "",
                    title = "Weather Data Visualization",
                    description = "Created interactive weather data visualizations using Python",
                    url = "",
                    imageUrls = emptyList(),
                    skills = emptyList(),
                    date = 0,
                    imageUrl = null
                )
            )
        )
    }
}
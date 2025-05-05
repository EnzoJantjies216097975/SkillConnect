package com.dst511s.skillconnect.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.dst511s.skillconnect.data.models.Project

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

//@Preview(showBackground = true)
//@Composable
//fun ProjectsContentPreview() {
//    SkillConnectTheme {
//        ProjectsContent(
//            projects = listOf(
//                Project("E-commerce Website", "Built a responsive e-commerce site with JavaScript, HTML and CSS", null),
//                Project("Weather Data Visualization", "Created interactive weather data visualizations using Python", null)
//            )
//        )
//    }
//}
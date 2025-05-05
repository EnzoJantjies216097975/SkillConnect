package com.dst511s.skillconnect.core.data.models.profile

import com.dst511s.skillconnect.data.models.JobPreferences

data class JobSeekerProfile(
    val userId: String = "",
    val title: String = "",
    val skills: List<Skill> = emptyList(),
    val education: List<Education> = emptyList(),
    val experience: List<Experience> = emptyList(),
    val projects: List<Project> = emptyList(),
    val certificates: List<Certificate> = emptyList(),
    val jobPreferences: JobPreferences = JobPreferences()
)

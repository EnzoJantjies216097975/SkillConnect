package com.dst511s.skillconnect.data.models

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

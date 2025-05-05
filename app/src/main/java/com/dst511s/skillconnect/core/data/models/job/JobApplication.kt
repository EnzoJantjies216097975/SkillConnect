package com.dst511s.skillconnect.core.data.models.job

data class JobApplication(
    val id: String = "",
    val jobId: String = "",
    val applicantId: String = "",
    val coverLetter: String = "",
    val highlightedSkills: List<String> = emptyList(),
    val highlightedProjects: List<String> = emptyList(),
    val customAnswers: Map<String, String> = emptyMap(),
    val status: com.dst511s.skillconnect.core.data.models.ApplicationStatus = com.dst511s.skillconnect.core.data.models.ApplicationStatus.SUBMITTED,
    val notes: List<com.dst511s.skillconnect.core.data.models.ApplicationNote> = emptyList(),
    val submittedAt: Long = 0,
    val lastUpdated: Long = 0
)

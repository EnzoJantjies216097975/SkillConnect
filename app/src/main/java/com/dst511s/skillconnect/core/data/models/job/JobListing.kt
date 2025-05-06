package com.dst511s.skillconnect.core.data.models.job

data class JobListing(
    val id: String = "",
    val employerId: String = "",
    val companyId: String = "",
    val title: String = "",
    val description: String = "",
    val responsibilities: List<String> = emptyList(),
    val requirements: List<String> = emptyList(),
    val requiredSkills: List<String> = emptyList(),
    val preferredSkills: List<String> = emptyList(),
    val employmentType: EmploymentType = EmploymentType.FULL_TIME,
    val remoteType: com.dst511s.skillconnect.core.data.models.RemotePreference = com.dst511s.skillconnect.core.data.models.RemotePreference.ON_SITE,
    val location: String = "",
    val salaryMin: Double? = null,
    val salaryMax: Double? = null,
    val currency: String = "USD",
    val isSalaryVisible: Boolean = false,
    val applicationDeadline: Long? = null,
    val status: JobStatus = JobStatus.ACTIVE,
    val createdAt: Long = 0,
    val updatedAt: Long = 0,
    val benefits: List<String> = emptyList()
)
package com.dst511s.skillconnect.core.data.models

data class JobPreferences(
    val desiredRoles: List<String> = emptyList(),
    val desiredIndustries: List<String> = emptyList(),
    val desiredLocations: List<String> = emptyList(),
    val remotePreference: RemotePreference = RemotePreference.NO_PREFERENCE,
    val employmentTypes: List<com.dst511s.skillconnect.core.data.models.job.EmploymentType> = emptyList(),
    val minSalary: Double? = null,
    val currency: String = "USD",
    val isAvailableForWork: Boolean = true,
    val availabilityDate: Long? = null
)

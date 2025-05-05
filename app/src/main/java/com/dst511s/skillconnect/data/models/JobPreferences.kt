package com.dst511s.skillconnect.data.models

data class JobPreferences(
    val desiredRoles: List<String> = emptyList(),
    val desiredIndustries: List<String> = emptyList(),
    val desiredLocations: List<String> = emptyList(),
    val remotePreference: RemotePreference = RemotePreference.NO_PREFERENCE,
    val employmentTypes: List<EmploymentType> = emptyList(),
    val minSalary: Double? = null,
    val currency: String = "USD",
    val isAvailableForWork: Boolean = true,
    val availabilityDate: Long? = null
)

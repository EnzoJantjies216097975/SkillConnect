package com.dst511s.skillconnect.core.data.models.auth

data class User(
    val id: String = "",
    val email: String = "",
    val fullName: String = "",
    val userType: UserType = UserType.JOB_SEEKER,
    val profilePhotoUrl: String? = null,
    val location: String = "",
    val bio: String = "",
    val profileCompletionPercentage: Int = 0,
    val createdAt: Long = 0,
    val updatedAt: Long = 0
)

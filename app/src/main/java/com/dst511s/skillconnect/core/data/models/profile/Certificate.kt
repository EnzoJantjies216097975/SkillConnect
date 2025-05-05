package com.dst511s.skillconnect.core.data.models.profile

data class Certificate(
    val id: String = "",
    val title: String = "",
    val issuer: String = "",
    val issueDate: Long = 0,
    val expirationDate: Long? = null,
    val verificationUrl: String = "",
    val skills: List<String> = emptyList()
)

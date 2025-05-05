package com.dst511s.skillconnect.data.models

data class Certificate(
    val id: String = "",
    val title: String = "",
    val issuer: String = "",
    val issueDate: Long = 0,
    val expirationDate: Long? = null,
    val verificationUrl: String = "",
    val skills: List<String> = emptyList()
)

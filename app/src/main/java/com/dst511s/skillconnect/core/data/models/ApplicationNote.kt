package com.dst511s.skillconnect.core.data.models

data class ApplicationNote(
    val id: String = "",
    val content: String = "",
    val createdBy: String = "",
    val createdAt: Long = 0,
    val isPrivate: Boolean = true
)

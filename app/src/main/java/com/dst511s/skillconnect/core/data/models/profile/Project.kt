package com.dst511s.skillconnect.core.data.models.profile

data class Project(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val url: String = "",
    val imageUrls: List<String> = emptyList(),
    val skills: List<String> = emptyList(),
    val date: Long = 0,
    val imageUrl: String?
)

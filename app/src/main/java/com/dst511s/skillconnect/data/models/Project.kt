package com.dst511s.skillconnect.data.models

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

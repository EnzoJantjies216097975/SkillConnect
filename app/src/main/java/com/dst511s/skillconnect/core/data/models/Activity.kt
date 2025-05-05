package com.dst511s.skillconnect.core.data.models

data class Activity(
    val title: String,
    val company: String,
    val time: String,
    val type: ActivityType,
    val status: String
)

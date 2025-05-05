package com.dst511s.skillconnect.data.models

data class WorkshopEvent(
    val id: String = "",
    val providerId: String = "",
    val title: String = "",
    val description: String = "",
    val type: WorkshopType = WorkshopType.WORKSHOP,
    val format: WorkshopFormat = WorkshopFormat.ONLINE,
    val startDate: Long = 0,
    val endDate: Long = 0,
    val timezone: String = "UTC",
    val location: String = "",
    val capacity: Int? = null,
    val registeredCount: Int = 0,
    val waitlistEnabled: Boolean = false,
    val cost: Double? = null,
    val currency: String = "USD",
    val skills: List<String> = emptyList(),
    val prerequisites: List<String> = emptyList(),
    val outcomes: List<String> = emptyList(),
    val instructor: Instructor = Instructor(),
    val status: WorkshopStatus = WorkshopStatus.SCHEDULED,
    val createdAt: Long = 0,
    val updatedAt: Long = 0
)

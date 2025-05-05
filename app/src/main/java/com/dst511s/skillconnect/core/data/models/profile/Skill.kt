package com.dst511s.skillconnect.core.data.models.profile

data class Skill(
    val id: String = "",
    val name: String = "",
    val level: com.dst511s.skillconnect.core.data.models.SkillLevel = com.dst511s.skillconnect.core.data.models.SkillLevel.BEGINNER,
    val isVerified: Boolean = false,
    val verificationDate: Long? = null,
    val category: String = ""
)

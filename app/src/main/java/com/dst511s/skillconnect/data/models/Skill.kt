package com.dst511s.skillconnect.data.models

data class Skill(
    val id: String = "",
    val name: String = "",
    val level: SkillLevel = SkillLevel.BEGINNER,
    val isVerified: Boolean = false,
    val verificationDate: Long? = null,
    val category: String = ""
)

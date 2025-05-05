package com.dst511s.skillconnect.data.models

data class SkillAssessment(
    val skillId: String,
    val skillName: String,
    val totalQuestions: Int,
    val estimatedDuration: String,
    val description: String,
    val questions: List<SkillQuestion>
)

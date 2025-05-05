package com.dst511s.skillconnect.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dst511s.skillconnect.data.models.Skill
import com.dst511s.skillconnect.data.models.SkillLevel
import com.dst511s.skillconnect.ui.theme.SkillConnectTheme

@Composable
fun SkillsContent(
    skills: List<Skill>,
    onSkillClick: (Skill) -> Unit
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            skills.take(3).forEach { skill ->
                SkillChip(
                    skill = skill,
                    onClick = { onSkillClick(skill) }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            skills.drop(3).take(3).forEach { skill ->
                SkillChip(
                    skill = skill,
                    onClick = { onSkillClick(skill) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SkillsContentPreview() {
    SkillConnectTheme {
        SkillsContent(
            skills = listOf(
                Skill(
                    id = "1",
                    name = "JavaScript",
                    level = SkillLevel.INTERMEDIATE,
                    isVerified = true,
                    verificationDate = null,
                    category = "Programming"
                ),
                Skill(
                    id = "2",
                    name = "HTML/CSS",
                    level = SkillLevel.ADVANCED,
                    isVerified = false,
                    verificationDate = null,
                    category = "Web Development"
                ),
                Skill(
                    id = "3",
                    name = "Python",
                    level = SkillLevel.INTERMEDIATE,
                    isVerified = false,
                    verificationDate = null,
                    category = "Programming"
                ),
                Skill(
                    id = "4",
                    name = "React",
                    level = SkillLevel.BEGINNER,
                    isVerified = false,
                    verificationDate = null,
                    category = "Frontend"
                )
            ),
            onSkillClick = {}
        )
    }
}
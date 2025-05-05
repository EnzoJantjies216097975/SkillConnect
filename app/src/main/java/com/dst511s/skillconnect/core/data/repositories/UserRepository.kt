package com.dst511s.skillconnect.core.data.repositories

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

val firestore = FirebaseFirestore.getInstance()
val auth = FirebaseAuth.getInstance()
val userRepository = UserRepository(
    firestore,
    auth
)

class UserRepository(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) {
    private val usersCollection = firestore.collection("users")
    private val jobSeekerProfilesCollection = firestore.collection("jobSeekerProfiles")

    suspend fun getCurrentUser(): com.dst511s.skillconnect.core.data.models.auth.User? {
        val currentUserId = auth.currentUser?.uid ?: return null
        return getUserById(currentUserId)
    }

    suspend fun getUserById(userId: String): com.dst511s.skillconnect.core.data.models.auth.User? {
        return try {
            val document = usersCollection.document(userId).get().await()
            document.toObject(com.dst511s.skillconnect.core.data.models.auth.User::class.java)
        } catch (e: Exception) {
            null
        }
    }

    suspend fun createUser(user: com.dst511s.skillconnect.core.data.models.auth.User): Boolean {
        return try {
            usersCollection.document(user.id).set(user).await()
            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun updateUser(user: com.dst511s.skillconnect.core.data.models.auth.User): Boolean {
        return try {
            usersCollection.document(user.id).set(user).await()
            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun getJobSeekerProfile(userId: String): com.dst511s.skillconnect.core.data.models.profile.JobSeekerProfile? {
        return try {
            val document = jobSeekerProfilesCollection.document(userId).get().await()
            document.toObject(com.dst511s.skillconnect.core.data.models.profile.JobSeekerProfile::class.java)
        } catch (e: Exception) {
            null
        }
    }

    suspend fun updateJobSeekerProfile(profile: com.dst511s.skillconnect.core.data.models.profile.JobSeekerProfile): Boolean {
        return try {
            jobSeekerProfilesCollection.document(profile.userId).set(profile).await()
            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun addSkill(
        userId: String,
        skill: com.dst511s.skillconnect.core.data.models.profile.Skill
    ): Boolean {
        return try {
            val profile = getJobSeekerProfile(userId) ?: return false
            val updatedSkills = profile.skills.toMutableList()
            updatedSkills.add(skill)

            jobSeekerProfilesCollection.document(userId)
                .update("skills", updatedSkills)
                .await()

            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun updateSkill(
        userId: String,
        skill: com.dst511s.skillconnect.core.data.models.profile.Skill
    ): Boolean {
        return try {
            val profile = getJobSeekerProfile(userId) ?: return false
            val updatedSkills = profile.skills.toMutableList()

            val index = updatedSkills.indexOfFirst { it.id == skill.id }
            if (index != -1) {
                updatedSkills[index] = skill

                jobSeekerProfilesCollection.document(userId)
                    .update("skills", updatedSkills)
                    .await()

                return true
            }

            false
        } catch (e: Exception) {
            false
        }
    }
}
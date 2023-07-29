package com.diger.designpatternwithspring.facadeproxystrategy.userservice

import com.diger.designpatternwithspring.domain.Grade
import com.diger.designpatternwithspring.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserCrudService(
    private val userRepository: com.diger.designpatternwithspring.facadeproxystrategy.userrepository.UserRepository
) {

    fun createUser(loginId: String, password: String): User {
        return userRepository.save(
            User(
                loginId = loginId,
                password = password,
                point = 0
            )
        )
    }

    @Transactional(readOnly = true)
    fun loadUserById(userId: Long): User {
        return userRepository.findByIdOrNull(userId) ?: throw IllegalArgumentException()
    }

    @Transactional
    fun updateUserGrade(userId: Long, grade: Grade) {
        val user = loadUserById(userId)
        user.updateGrade(grade)
    }

    @Transactional
    fun deleteUser(userId: Long) {
        val user = loadUserById(userId)
        userRepository.deleteById(userId)
    }
}
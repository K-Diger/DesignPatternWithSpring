package com.diger.designpatternwithspring.domain.user.strategypattern.service

import com.diger.designpatternwithspring.domain.user.Grade
import com.diger.designpatternwithspring.domain.user.User
import com.diger.designpatternwithspring.domain.user.strategypattern.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.IllegalArgumentException


@Service
@Transactional
class UserService(
    private val userRepository: UserRepository
) {

    fun createUser(loginId: String, password: String) {
        userRepository.save(
            User(
                loginId = loginId,
                password = password,
                point = 0
            )
        )
    }

    fun updateUserGradeVIP(userId: Long) {
        val user = userRepository.findByIdOrNull(userId) ?: throw IllegalArgumentException()
        user.updateGrade(Grade.VIP)
    }

}
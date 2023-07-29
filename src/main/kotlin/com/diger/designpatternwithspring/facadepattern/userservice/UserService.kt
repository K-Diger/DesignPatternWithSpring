package com.diger.designpatternwithspring.facadepattern.userservice

import com.diger.designpatternwithspring.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.IllegalArgumentException

@Service
@Transactional
class UserService(
    private val userRepository: com.diger.designpatternwithspring.facadepattern.userrepository.UserRepository,
) {

    fun createUser(loginId: String, password: String): User {
        return userRepository.save(
            User(
                loginId = loginId,
                password = password,
                point = 0,
            )
        )
    }

    fun loadUser(id: Long): User {
        return userRepository.findByIdOrNull(id) ?: throw IllegalArgumentException()
    }

    fun deleteUser(id: Long){
        userRepository.deleteById(id)
    }

}
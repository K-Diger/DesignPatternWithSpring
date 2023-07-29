package com.diger.designpatternwithspring.domain.user.proxypattern.service

import com.diger.designpatternwithspring.domain.user.User
import com.diger.designpatternwithspring.domain.user.proxypattern.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserProxyServiceImpl(
    private val userRepository: UserRepository,
) : UserProxyService {

    override fun createUser(loginId: String, password: String): User {
        // 핵심 로직
        return userRepository.save(
            User(
                loginId = loginId,
                password = password,
                point = 0,
            )
        )

        // 부가 로직
        logPosting()
    }

    private fun logPosting() {
        println("게시글을 생성하는 로그를 기록했습니다.")
    }
}
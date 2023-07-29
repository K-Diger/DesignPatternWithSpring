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
        println("로깅을 수행합니다. log4j는 귀찮아서 추가를 안했슴다.")
        return userRepository.save(
            User(
                loginId = loginId,
                password = password,
                point = 0,
            )
        )
        println("유저를 생성하는 로그를 기록했습니다.")
    }
}
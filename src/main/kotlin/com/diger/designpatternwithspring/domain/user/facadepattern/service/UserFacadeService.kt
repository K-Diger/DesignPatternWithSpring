package com.diger.designpatternwithspring.domain.user.facadepattern.service

import com.diger.designpatternwithspring.domain.post.facadepattern.service.FPPostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserFacadeService(
    private val fpPostService: FPPostService,
    private val userService: UserService
) {

    fun createUser(loginId: String, password: String) {
        val createUser = userService.createUser(loginId, password)

        fpPostService.createPost(
            title = "${loginId} 님의 회원가입 환영 게시글입니다.",
            content = "모두 환영해주세요!",
            user = createUser
        )
    }
}
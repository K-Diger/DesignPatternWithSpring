package com.diger.designpatternwithspring.facadepattern.userservice

import com.diger.designpatternwithspring.domain.post.facadepattern.postservice.PostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserFacadeService(
    private val postService: PostService,
    private val userService: com.diger.designpatternwithspring.facadepattern.userservice.UserService
) {

    fun createUser(loginId: String, password: String) {
        val createUser = userService.createUser(loginId, password)

        postService.createPost(
            title = "${loginId} 님의 회원가입 환영 게시글입니다.",
            content = "모두 환영해주세요!",
            userId = createUser.id
        )
    }
}
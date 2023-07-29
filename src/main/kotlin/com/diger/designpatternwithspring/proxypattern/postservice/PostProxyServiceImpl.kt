package com.diger.designpatternwithspring.domain.user.proxypattern.service

import com.diger.designpatternwithspring.domain.Post
import com.diger.designpatternwithspring.domain.user.proxypattern.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostProxyServiceImpl(
    private val postRepository: PostRepository,
    private val userRepository: com.diger.designpatternwithspring.proxypattern.userrepository.UserRepository,
) : PostProxyService {

    override fun createPost(title: String, content: String, userId: Long) {
        // 핵심 기능
        postRepository.save(
            Post(
                title = title,
                content = content,
                user = userRepository.findByIdOrNull(userId) ?: throw IllegalArgumentException()
            )
        )

        // 부가 기능
        logPosting()
    }

    private fun logPosting() {
        println("게시글을 생성하는 로그를 기록했습니다.")
    }
}
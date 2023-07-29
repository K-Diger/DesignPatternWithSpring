package com.diger.designpatternwithspring.domain.post.facadepattern.service

import com.diger.designpatternwithspring.domain.post.Post
import com.diger.designpatternwithspring.domain.user.User
import com.diger.designpatternwithspring.domain.post.facadepattern.repository.PostRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class StrategyPatternUserService(
    private val postRepository: PostRepository,
) {

    fun createPost(title: String, content: String, user: User) {
        postRepository.save(
            Post(
                title = title,
                content = content,
                user = user
            )
        )
    }
}
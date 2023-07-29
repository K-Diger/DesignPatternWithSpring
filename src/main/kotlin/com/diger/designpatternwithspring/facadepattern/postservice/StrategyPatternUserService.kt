package com.diger.designpatternwithspring.facadepattern.postservice

import com.diger.designpatternwithspring.domain.Post
import com.diger.designpatternwithspring.domain.User
import com.diger.designpatternwithspring.domain.post.facadepattern.postrepository.PostRepository
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
package com.diger.designpatternwithspring.domain.post.facadepattern.postservice

import com.diger.designpatternwithspring.domain.Post
import com.diger.designpatternwithspring.domain.post.facadepattern.postrepository.PostRepository
import com.diger.designpatternwithspring.domain.Grade.*
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostService(
    private val postRepository: PostRepository,
    private val userRepository: com.diger.designpatternwithspring.strategypattern.userrepository.UserRepository
) {

    fun createPost(title: String, content: String, userId: Long) {
        val user = userRepository.findByIdOrNull(userId) ?: throw IllegalArgumentException()
        postRepository.save(
            Post(
                title = title,
                content = content,
                user = user
            )
        )

        when (user.grade) {
            NORMAL -> user.updatePoint(strategy = com.diger.designpatternwithspring.strategypattern.userservice.strategy.NormalUserPointStrategy())
            HARD -> user.updatePoint(strategy = com.diger.designpatternwithspring.strategypattern.userservice.strategy.HardUserPointStrategy())
            VIP -> user.updatePoint(strategy = com.diger.designpatternwithspring.strategypattern.userservice.strategy.VIPUserPointStrategy())
        }

    }
}
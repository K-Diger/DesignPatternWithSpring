package com.diger.designpatternwithspring.domain.post.facadepattern.service

import com.diger.designpatternwithspring.domain.post.Post
import com.diger.designpatternwithspring.domain.post.facadepattern.repository.PostRepository
import com.diger.designpatternwithspring.domain.user.Grade.*
import com.diger.designpatternwithspring.domain.user.strategypattern.repository.UserRepository
import com.diger.designpatternwithspring.domain.user.strategypattern.service.strategy.HardUserPointStrategy
import com.diger.designpatternwithspring.domain.user.strategypattern.service.strategy.NormalUserPointStrategy
import com.diger.designpatternwithspring.domain.user.strategypattern.service.strategy.VIPUserPointStrategy
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostService(
    private val postRepository: PostRepository,
    private val userRepository: UserRepository
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
            NORMAL -> user.updatePoint(strategy = NormalUserPointStrategy())
            HARD -> user.updatePoint(strategy = HardUserPointStrategy())
            VIP -> user.updatePoint(strategy = VIPUserPointStrategy())
        }

    }
}
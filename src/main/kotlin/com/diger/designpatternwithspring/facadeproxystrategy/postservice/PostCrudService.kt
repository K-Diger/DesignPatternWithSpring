package com.diger.designpatternwithspring.facadeproxystrategy.postservice

import com.diger.designpatternwithspring.domain.Post
import com.diger.designpatternwithspring.facadeproxystrategy.postrepository.PostRepository
import com.diger.designpatternwithspring.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostCrudService(
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

    @Transactional(readOnly = true)
    fun loadPostById(postId: Long) : Post {
        return postRepository.findByIdOrNull(postId) ?: throw IllegalArgumentException()
    }

    fun updateContent(postId: Long, content: String) {
        val post = loadPostById(postId)
        post.updateContent(content)
    }

    fun deleteById(postId: Long) {
        postRepository.deleteById(postId)
    }
}
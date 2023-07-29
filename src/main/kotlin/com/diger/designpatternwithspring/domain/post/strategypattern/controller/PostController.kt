package com.diger.designpatternwithspring.domain.post.facadepattern.controller

import com.diger.designpatternwithspring.domain.post.facadepattern.service.PostService
import com.diger.designpatternwithspring.domain.post.strategypattern.controller.CreatePostRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/facade")
class PostController(
    private val postService: PostService
) {

    @PostMapping
    fun createPost(@RequestBody createPostRequest: CreatePostRequest) {
        postService.createPost(
            title = createPostRequest.title,
            content = createPostRequest.content,
            userId = createPostRequest.writtenUserId
        )
    }
}
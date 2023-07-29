package com.diger.designpatternwithspring.domain.user.proxypattern.controller

import com.diger.designpatternwithspring.domain.user.proxypattern.service.PostProxyService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/proxy")
class PostController(
    private val postProxyService: PostProxyService
) {

    @PostMapping
    fun createPost(@RequestBody createPostRequest: CreatePostRequest) {
        postProxyService.createPost(
            title = createPostRequest.title,
            content = createPostRequest.content,
            userId = createPostRequest.userId
        )
    }
}
package com.diger.designpatternwithspring.facadeproxystrategy.postcontroller

import com.diger.designpatternwithspring.facadeproxystrategy.postcontroller.dto.CreatePostRequest
import com.diger.designpatternwithspring.facadeproxystrategy.postservice.PostFacadeProxyService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/post")
class PostController(
    private val postFacadeProxyService: PostFacadeProxyService
) {

    @PostMapping
    fun createPost(@RequestBody createPostRequest: CreatePostRequest) {
        postFacadeProxyService.createPostAndLogRequest(
            title = createPostRequest.title,
            content = createPostRequest.content,
            userId = createPostRequest.userId
        )
    }
}
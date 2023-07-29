package com.diger.designpatternwithspring.facadepattern.postcontroller

import com.diger.designpatternwithspring.domain.post.facadepattern.postservice.PostService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/facade")
class FPPostController(
    private val postService: PostService
) {

    
}
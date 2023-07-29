package com.diger.designpatternwithspring.facadepattern.postservice

import com.diger.designpatternwithspring.domain.post.facadepattern.postservice.PostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostFacadeService(
    private val postService: PostService,

    ) {
}
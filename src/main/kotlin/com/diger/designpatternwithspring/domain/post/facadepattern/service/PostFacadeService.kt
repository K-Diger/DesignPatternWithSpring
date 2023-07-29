package com.diger.designpatternwithspring.domain.post.facadepattern.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostFacadeService(
    private val postService: PostService,

    ) {
}
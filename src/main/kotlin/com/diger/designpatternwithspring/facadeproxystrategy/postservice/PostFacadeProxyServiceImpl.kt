package com.diger.designpatternwithspring.facadeproxystrategy.postservice

import org.springframework.stereotype.Service

@Service
class PostFacadeProxyServiceImpl(
    private val postCrudService: PostCrudService,
    private val userCrudService: com.diger.designpatternwithspring.facadeproxystrategy.userservice.UserCrudService
) : PostFacadeProxyService {
    override fun createPostAndLogRequest(title: String, content: String, userId: Long) {

    }
}
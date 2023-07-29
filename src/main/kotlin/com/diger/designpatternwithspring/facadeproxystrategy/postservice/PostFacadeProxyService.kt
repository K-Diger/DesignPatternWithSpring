package com.diger.designpatternwithspring.facadeproxystrategy.postservice

interface PostFacadeProxyService {
    fun createPostAndLogRequest(title: String, content: String, userId: Long)
}
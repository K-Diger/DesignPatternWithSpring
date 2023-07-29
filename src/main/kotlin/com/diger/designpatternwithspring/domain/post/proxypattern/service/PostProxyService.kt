package com.diger.designpatternwithspring.domain.user.proxypattern.service

interface PostProxyService {
    fun createPost(title: String, content: String, userId: Long)
}
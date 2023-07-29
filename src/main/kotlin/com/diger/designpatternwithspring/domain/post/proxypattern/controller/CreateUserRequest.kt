package com.diger.designpatternwithspring.domain.user.proxypattern.controller

data class CreatePostRequest(
    val title: String,
    val content: String,
    val userId: Long,
)

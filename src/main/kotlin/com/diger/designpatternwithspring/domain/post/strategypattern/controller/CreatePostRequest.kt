package com.diger.designpatternwithspring.domain.post.strategypattern.controller

data class CreatePostRequest(
    val title: String,
    val content: String,
    val writtenUserId : Long,
)
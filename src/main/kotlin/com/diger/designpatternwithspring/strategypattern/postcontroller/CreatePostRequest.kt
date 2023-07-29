package com.diger.designpatternwithspring.strategypattern.postcontroller

data class CreatePostRequest(
    val title: String,
    val content: String,
    val writtenUserId : Long,
)
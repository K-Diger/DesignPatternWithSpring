package com.diger.designpatternwithspring.facadeproxystrategy.postcontroller.dto

data class CreatePostRequest(
    val title: String,
    val content: String,
    val userId: Long
)

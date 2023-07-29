package com.diger.designpatternwithspring.domain.post.facadepattern.repository

import com.diger.designpatternwithspring.domain.post.Post
import org.springframework.data.jpa.repository.JpaRepository

interface FPPostRepository : JpaRepository<Post, Long> {
}
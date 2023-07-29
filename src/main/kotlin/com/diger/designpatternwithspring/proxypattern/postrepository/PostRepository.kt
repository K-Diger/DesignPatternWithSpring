package com.diger.designpatternwithspring.domain.user.proxypattern.repository

import com.diger.designpatternwithspring.domain.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}
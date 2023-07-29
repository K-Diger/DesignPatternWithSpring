package com.diger.designpatternwithspring.domain.post.facadepattern.postrepository

import com.diger.designpatternwithspring.domain.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}
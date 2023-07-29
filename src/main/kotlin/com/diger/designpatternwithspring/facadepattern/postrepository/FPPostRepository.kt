package com.diger.designpatternwithspring.facadepattern.postrepository

import com.diger.designpatternwithspring.domain.Post
import org.springframework.data.jpa.repository.JpaRepository

interface FPPostRepository : JpaRepository<Post, Long> {
}
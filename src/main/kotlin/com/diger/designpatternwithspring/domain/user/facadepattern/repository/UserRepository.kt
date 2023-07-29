package com.diger.designpatternwithspring.domain.user.facadepattern.repository

import com.diger.designpatternwithspring.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}
package com.diger.designpatternwithspring.proxypattern.userrepository

import com.diger.designpatternwithspring.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}
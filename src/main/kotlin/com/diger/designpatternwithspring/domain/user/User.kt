package com.diger.designpatternwithspring.domain.user

import jakarta.persistence.*
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0L,

    @Column
    private val loginId: String,

    @Column
    private val password: String,

    @Column
    private val point: Int,

    @CreatedDate
    private var createdAt: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    private var updatedAt: LocalDateTime = LocalDateTime.now()
) {
}
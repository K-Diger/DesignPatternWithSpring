package com.diger.designpatternwithspring.domain.post

import com.diger.designpatternwithspring.domain.user.User
import jakarta.persistence.*
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
class Post(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0L,

    @Column
    private val title: String,

    @Column
    private val content: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private val user: User,

    @CreatedDate
    private var createdAt: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    private var updatedAt: LocalDateTime = LocalDateTime.now()
) {
}
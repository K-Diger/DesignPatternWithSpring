package com.diger.designpatternwithspring.domain.user

import com.diger.designpatternwithspring.domain.user.strategypattern.service.strategy.PointStrategy
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
    private var point: Int,

    @Column
    var grade: Grade = Grade.NORMAL,

    @CreatedDate
    private var createdAt: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    private var updatedAt: LocalDateTime = LocalDateTime.now()
) {

    fun updatePoint(strategy: PointStrategy) {
        println("포인트 추가 전략은 ${strategy} 입니다.")
        this.point += strategy.calculateStrategy(this)
    }

    fun updateGrade(grade: Grade) {
        this.grade = grade
    }
}
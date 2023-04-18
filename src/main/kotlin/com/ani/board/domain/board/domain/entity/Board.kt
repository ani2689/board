package com.ani.board.domain.board.domain.entity

import com.ani.board.domain.user.domain.entity.User
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*

@Entity
@DynamicUpdate
class Board (

    @Id
    var id: Long,

    @Column(columnDefinition = "TEXT")
    var title: String,

    @Column(columnDefinition = "TEXT")
    var detail: String,

    var bookmark: Int,

    @ManyToOne(fetch = FetchType.EAGER)
    val author: User

)
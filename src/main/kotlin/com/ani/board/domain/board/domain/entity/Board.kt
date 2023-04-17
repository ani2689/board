package com.ani.board.domain.board.domain.entity

import com.ani.board.domain.user.domain.entity.User
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Board (

    @Id
    var id: Long = 0,

    var title: String,

    var detail: String,

    var bookmark: Int,

    @ManyToOne(fetch = FetchType.EAGER)
    val writer: User

)
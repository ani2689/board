package com.ani.board.domain.user.domain.entity

import com.ani.board.domain.board.domain.entity.Board
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class User (

    @Id
    var id: Long = 0,

    var name: String,

    var password: String,

    @OneToMany(fetch = FetchType.LAZY)
    var boardWritten: List<Board>,

    @OneToMany(fetch = FetchType.LAZY)
    var bookmark: List<Board>
)
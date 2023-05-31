package com.ani.board.domain.user.domain.entity

import com.ani.board.domain.board.domain.entity.Board
import com.ani.board.domain.user.domain.entity.role.UserRole
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*

@Entity
@DynamicUpdate
class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(unique = true)
    var name: String,

    var password: String,

    @Enumerated(EnumType.STRING)
    var role: UserRole,

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    var script: List<Board>?,

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    var bookmark: List<Board>?
){
    fun updatePassword(password: String){
        this.password=password
    }
    fun updateName(name: String){
        this.name = name
    }
}
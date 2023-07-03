package com.ani.board.domain.user.util

import com.ani.board.domain.user.domain.entity.User

interface UserConverter {
    fun toEntity(name: String, password: String) : User
}
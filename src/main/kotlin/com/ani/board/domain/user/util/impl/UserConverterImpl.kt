package com.ani.board.domain.user.util.impl

import com.ani.board.domain.user.domain.entity.User
import com.ani.board.domain.user.domain.entity.role.UserRole
import com.ani.board.domain.user.util.UserConverter
import org.springframework.stereotype.Component

@Component
class UserConverterImpl : UserConverter {
    override fun toEntity(name: String, password: String) =
        User(
            0,
            name,
            password,
            UserRole.BASIC,
            null,
            null
        )
}
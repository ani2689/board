package com.ani.board.global.util

import com.ani.board.domain.user.domain.entity.User
import com.ani.board.domain.user.domain.repository.UserRepository
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component

@Component
class UserUtil(
    val userRepository: UserRepository
){
    fun findCurrentLoginUser(): User {
        val userDetails = SecurityContextHolder.getContext().authentication.principal as UserDetails
        return userRepository.findByName(userDetails.username)
    }
}
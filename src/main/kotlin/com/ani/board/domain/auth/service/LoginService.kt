package com.ani.board.domain.auth.service

import com.ani.board.domain.auth.presentation.data.dto.LoginDto

interface LoginService {
    fun execute(loginDto: LoginDto)
}
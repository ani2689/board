package com.ani.board.domain.auth.utils

import com.ani.board.domain.auth.presentation.data.dto.LoginDto
import com.ani.board.domain.auth.presentation.data.dto.SignupDto
import com.ani.board.domain.auth.presentation.data.requestDto.LoginRequestDto
import com.ani.board.domain.auth.presentation.data.requestDto.SignupRequestDto

interface AuthConverter {
    fun toDto(loginRequestDto: LoginRequestDto): LoginDto
    fun toDto(signupRequestDto: SignupRequestDto): SignupDto
}
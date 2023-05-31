package com.ani.board.domain.auth.utils.impl

import com.ani.board.domain.auth.presentation.data.dto.LoginDto
import com.ani.board.domain.auth.presentation.data.dto.SignupDto
import com.ani.board.domain.auth.presentation.data.requestDto.LoginRequestDto
import com.ani.board.domain.auth.presentation.data.requestDto.SignupRequestDto
import com.ani.board.domain.auth.utils.AuthConverter
import org.springframework.stereotype.Component

@Component
class AuthConverterImpl : AuthConverter {
    override fun toDto(loginRequestDto: LoginRequestDto): LoginDto =
        LoginDto(
            loginRequestDto.name,
            loginRequestDto.password
        )

    override fun toDto(signupRequestDto: SignupRequestDto): SignupDto =
        SignupDto(
            signupRequestDto.name,
            signupRequestDto.password
        )
}
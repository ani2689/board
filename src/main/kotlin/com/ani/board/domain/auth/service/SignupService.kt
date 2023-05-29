package com.ani.board.domain.auth.service

import com.ani.board.domain.auth.presentation.data.dto.SignupDto

interface SignupService {
    fun execute(signupDto: SignupDto)
}
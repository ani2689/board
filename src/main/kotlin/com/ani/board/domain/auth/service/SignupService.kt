package com.ani.board.domain.auth.service

interface SignupService {
    fun execute(name: String, password: String)
}
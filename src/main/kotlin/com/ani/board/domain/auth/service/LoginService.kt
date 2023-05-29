package com.ani.board.domain.auth.service

interface LoginService {
    fun execute(name: String, password: String)
}
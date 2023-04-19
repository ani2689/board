package com.ani.board.domain.board.service

import org.springframework.stereotype.Service

@Service
interface CreateBoardService {
    fun execute(title: String, detail: String)
}
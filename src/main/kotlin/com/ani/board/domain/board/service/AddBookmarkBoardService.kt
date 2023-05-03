package com.ani.board.domain.board.service

import org.springframework.stereotype.Service

@Service
interface AddBookmarkBoardService {
    fun execute(id: Long)
}
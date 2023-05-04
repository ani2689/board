package com.ani.board.domain.board.service

import org.springframework.stereotype.Service

@Service
interface RemoveBookmarkBoardService {
    fun execute(id: Long)
}
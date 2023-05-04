package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.UpdateBoardDto

interface UpdateBoardService {
    fun execute(boardId: Long, updateBoardDto: UpdateBoardDto)
}
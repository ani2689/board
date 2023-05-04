package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.DetailBoardDto

interface FindBoardByIdService {
    fun execute(id: Long): DetailBoardDto
}
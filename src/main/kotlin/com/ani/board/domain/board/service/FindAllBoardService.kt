package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.BoardListDto

interface FindAllBoardService {
    fun execute(): List<BoardListDto>
}
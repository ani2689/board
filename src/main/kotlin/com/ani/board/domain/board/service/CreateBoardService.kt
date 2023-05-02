package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.presentation.data.request4.CreateBoardRequestDto
import org.springframework.stereotype.Service

@Service
interface CreateBoardService {
    fun execute(boardDto: BoardDto)
}
package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import org.springframework.stereotype.Service

@Service
interface FindAllBoardService {
    fun execute(): List<BoardDto>
}
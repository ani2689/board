package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.presentation.data.dto.DetailBoardDto
import org.springframework.stereotype.Service

@Service
interface FindBoardByIdService {
    fun execute(id: Long): DetailBoardDto
}
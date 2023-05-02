package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.presentation.data.dto.BoardListDto
import com.ani.board.domain.board.presentation.data.dto.DetailBoardDto
import com.ani.board.domain.board.presentation.data.response.BoardListResponseDto
import org.springframework.stereotype.Service

@Service
interface FindAllBoardService {
    fun execute(): List<BoardListDto>
}
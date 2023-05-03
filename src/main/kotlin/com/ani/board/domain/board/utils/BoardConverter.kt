package com.ani.board.domain.board.utils

import com.ani.board.domain.board.domain.entity.Board
import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.presentation.data.dto.BoardListDto
import com.ani.board.domain.board.presentation.data.dto.DetailBoardDto
import com.ani.board.domain.board.presentation.data.dto.UpdateBoardDto
import com.ani.board.domain.board.presentation.data.request4.CreateBoardRequestDto
import com.ani.board.domain.board.presentation.data.request4.UpdateBoardRequestDto
import com.ani.board.domain.board.presentation.data.response.BoardListResponseDto
import com.ani.board.domain.board.presentation.data.response.DetailBoardResponseDto
import com.ani.board.domain.user.domain.entity.User
import org.springframework.stereotype.Component

@Component
interface BoardConverter {
    fun toDto(createBoardRequestDto: CreateBoardRequestDto): BoardDto
    fun toDto(updateBoardRequestDto: UpdateBoardRequestDto): UpdateBoardDto
    fun toResponseDto(boardListDto: BoardListDto): BoardListResponseDto
    fun toResponseDto(detailBoardDto: DetailBoardDto): DetailBoardResponseDto
    fun toEntity(boardDto: BoardDto, user: User): Board
}
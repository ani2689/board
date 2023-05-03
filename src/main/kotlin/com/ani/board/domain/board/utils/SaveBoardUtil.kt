package com.ani.board.domain.board.utils

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import org.apache.catalina.User
import org.springframework.stereotype.Service
interface SaveBoardUtil{
    fun save(board: BoardDto)
}
package com.ani.board.domain.board.utils

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import org.apache.catalina.User
import org.springframework.stereotype.Service

@Service
interface SaveBoardUtil {
    fun execute(board: BoardDto, user: User)
}
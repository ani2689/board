package com.ani.board.domain.board.service

import com.ani.board.domain.board.presentation.data.request4.UpdateBoardRequestDto
import org.springframework.stereotype.Service

@Service
interface ModifyBoardService {
    fun execute(updateBoardRequestDto: UpdateBoardRequestDto)
}
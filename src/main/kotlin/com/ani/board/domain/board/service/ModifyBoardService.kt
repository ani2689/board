package com.ani.board.domain.board.service

import org.springframework.stereotype.Service

@Service
interface ModifyBoardService {
    fun execute(updateBoardRequestDto: Upda)
}
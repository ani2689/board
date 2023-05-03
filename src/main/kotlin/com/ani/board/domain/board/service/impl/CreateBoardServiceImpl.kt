package com.ani.board.domain.board.service.impl

import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.service.CreateBoardService
import com.ani.board.domain.board.utils.SaveBoardUtil
import org.springframework.stereotype.Service

@Service
class CreateBoardServiceImpl(
    private val saveBoardUtil: SaveBoardUtil
) : CreateBoardService{
    override fun execute(boardDto: BoardDto) {
        saveBoardUtil.save(boardDto)
    }
}
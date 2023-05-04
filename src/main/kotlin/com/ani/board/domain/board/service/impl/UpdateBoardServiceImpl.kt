package com.ani.board.domain.board.service.impl

import com.ani.board.domain.board.domain.entity.Board
import com.ani.board.domain.board.domain.repository.BoardRepository
import com.ani.board.domain.board.presentation.data.dto.UpdateBoardDto
import com.ani.board.domain.board.service.UpdateBoardService
import com.ani.board.domain.board.utils.BoardConverter
import com.ani.board.domain.board.utils.SaveBoardUtil
import org.springframework.stereotype.Service

@Service
class UpdateBoardServiceImpl(
    private val boardRepository: BoardRepository,
    private val boardConverter: BoardConverter,
    private val saveBoardUtil: SaveBoardUtil
) : UpdateBoardService {
    override fun execute(boardId: Long, updateBoardDto: UpdateBoardDto) {
        findBoard(boardId)
            .updateDetail(updateBoardDto.detail)
            .updateTitle(updateBoardDto.title)
            .let{ saveBoardUtil.save(it) }
    }

    fun findBoard(id: Long): Board {
        return boardRepository.findById(id).get()
    }
}
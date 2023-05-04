package com.ani.board.domain.board.service.impl

import com.ani.board.domain.board.domain.repository.BoardRepository
import com.ani.board.domain.board.service.DeleteBoardService
import com.ani.board.domain.board.utils.BoardConverter
import org.springframework.stereotype.Service

@Service
class DeleteBoardServiceImpl(
    private val boardRepository: BoardRepository,
    private val boardConverter: BoardConverter
) : DeleteBoardService {
    override fun execute(boardId: Long) {
        boardRepository.findById(boardId).get()
            .let { boardRepository.delete(it) }
    }
}
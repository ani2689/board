package com.ani.board.domain.board.service.impl

import com.ani.board.domain.board.domain.entity.Board
import com.ani.board.domain.board.domain.repository.BoardRepository
import com.ani.board.domain.board.service.AddBookmarkBoardService
import com.ani.board.domain.board.utils.BoardConverter
import com.ani.board.domain.board.utils.SaveBoardUtil
import org.springframework.stereotype.Service

@Service
class AddBookmarkBoardServiceImpl(
    private val boardRepository: BoardRepository,
    private val boardConverter: BoardConverter,
    private val saveBoardUtil: SaveBoardUtil
) : AddBookmarkBoardService {
    override fun execute(id: Long) {
        findBoard(id).addBookmark()
            .let { saveBoardUtil.save(it) }
    }

    fun findBoard(id: Long): Board {
        return boardRepository.findById(id).get()
    }
}
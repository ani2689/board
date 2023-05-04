package com.ani.board.domain.board.service.impl

import com.ani.board.domain.board.domain.repository.BoardRepository
import com.ani.board.domain.board.presentation.data.dto.BoardListDto
import com.ani.board.domain.board.service.FindAllBoardService
import com.ani.board.domain.board.utils.BoardConverter

class FindAllBoardServiceImpl(
    private val boardRepository: BoardRepository,
    private val boardConverter: BoardConverter
) : FindAllBoardService {
    override fun execute(): List<BoardListDto> {
        return boardRepository.findAll()
            .map { boardConverter.toDto(it) }
            .map { boardConverter.toDto(it) }
            .map { boardConverter.toDto(it) }
    }
}
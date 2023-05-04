package com.ani.board.domain.board.service.impl

import com.ani.board.domain.board.domain.repository.BoardRepository
import com.ani.board.domain.board.presentation.data.dto.DetailBoardDto
import com.ani.board.domain.board.service.FindBoardByIdService
import com.ani.board.domain.board.utils.BoardConverter

class FindBoardByIdServiceImpl(
    private val boardRepository: BoardRepository,
    private val boardConverter: BoardConverter
) : FindBoardByIdService {
    override fun execute(id: Long): DetailBoardDto {
        return boardRepository.findById(id).get()
            .let {boardConverter.toDto(it)}
    }

}
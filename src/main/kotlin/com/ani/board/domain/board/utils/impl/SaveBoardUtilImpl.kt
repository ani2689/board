package com.ani.board.domain.board.utils.impl

import com.ani.board.domain.board.domain.repository.BoardRepository
import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.utils.BoardConverter
import com.ani.board.domain.board.utils.SaveBoardUtil
import com.ani.board.global.util.UserUtil
import org.springframework.stereotype.Component

@Component
class SaveBoardUtilImpl(
    val userUtil: UserUtil,
    val boardRepository: BoardRepository,
    val boardConverter: BoardConverter
) : SaveBoardUtil {
    override fun save(board: BoardDto) {
        userUtil.findCurrentLoginUser()
            .let { boardConverter.toEntity(board,it) }
            .let {boardRepository.save(it)}
    }

}
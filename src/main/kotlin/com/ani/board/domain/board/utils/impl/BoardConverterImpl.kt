package com.ani.board.domain.board.utils.impl

import com.ani.board.domain.board.domain.entity.Board
import com.ani.board.domain.board.presentation.data.dto.BoardDto
import com.ani.board.domain.board.presentation.data.dto.BoardListDto
import com.ani.board.domain.board.presentation.data.dto.DetailBoardDto
import com.ani.board.domain.board.presentation.data.dto.UpdateBoardDto
import com.ani.board.domain.board.presentation.data.request4.CreateBoardRequestDto
import com.ani.board.domain.board.presentation.data.request4.UpdateBoardRequestDto
import com.ani.board.domain.board.presentation.data.response.BoardListResponseDto
import com.ani.board.domain.board.presentation.data.response.DetailBoardResponseDto
import com.ani.board.domain.board.utils.BoardConverter
import com.ani.board.domain.user.domain.entity.User
import com.ani.board.global.util.UserUtil
import org.springframework.stereotype.Component

@Component
class BoardConverterImpl (
    private val userUtil: UserUtil,
    private val boardConverter: BoardConverter
) : BoardConverter {
    override fun toDto(createBoardRequestDto: CreateBoardRequestDto): BoardDto {
        return BoardDto(
            createBoardRequestDto.title,
            createBoardRequestDto.detail,
            userUtil.findCurrentLoginUser().name,
            0
        )
    }

    override fun toDto(updateBoardRequestDto: UpdateBoardRequestDto): UpdateBoardDto {
        return UpdateBoardDto(
            updateBoardRequestDto.title,
            updateBoardRequestDto.detail
        )
    }

    override fun toDto(board: Board): DetailBoardDto {
        return DetailBoardDto(
            board.id,
            board.title,
            board.title,
            DetailBoardDto.UserDto(
                board.author.id,
                board.author.name,
                board.author.script
                    ?.map { boardConverter.toDto(it)}
                    ?.map { boardConverter.toDto(it)},
                board.author.bookmark
                    ?.map { boardConverter.toDto(it)}
                    ?.map { boardConverter.toDto(it)},
            ),
            board.bookmark
        )
    }

    override fun toDto(detailBoardDto: DetailBoardDto): BoardDto {
        return BoardDto(
            detailBoardDto.title,
            detailBoardDto.detail,
            detailBoardDto.author.name,
            detailBoardDto.bookmark
        )
    }

    override fun toDto(boardDto: BoardDto): BoardListDto {
        return BoardListDto(
            boardDto.title,
            boardDto.bookmark
        )
    }

    override fun toResponseDto(boardListDto: BoardListDto): BoardListResponseDto {
        return BoardListResponseDto(
            boardListDto.title,
            boardListDto.bookmark
        )
    }

    override fun toResponseDto(detailBoardDto: DetailBoardDto): DetailBoardResponseDto {
        return DetailBoardResponseDto(
            detailBoardDto.title,
            detailBoardDto.detail,
            detailBoardDto.bookmark,
            detailBoardDto.author.name
        )
    }

    override fun toEntity(boardDto: BoardDto, user: User): Board {
        return Board(
            0L,
            boardDto.title,
            boardDto.detail,
            boardDto.bookmark,
            user
        )
    }
}
package com.ani.board.domain.board.presentation.data.dto;

data class UpdateBoardDto (
    val id: Long,
    val title: String,
    val detail: String,
    val author: UserDto,
    val bookmark: Int
){
        data class UserDto(
                val id: Long,
                val name: String,
                val script: List<BoardDto>?,
                val bookmark: List<BoardDto>?

        )
}

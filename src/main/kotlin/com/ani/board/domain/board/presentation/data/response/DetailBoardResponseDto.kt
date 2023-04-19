package com.ani.board.domain.board.presentation.data.response


data class DetailBoardResponseDto (
    val title: String,
    val detail: String,
    val bookmark: Int,
    val author: UserResponseDto
){
    data class UserResponseDto(
        val name: String
    )
}
package com.ani.board.domain.board.presentation.data.dto

data class BoardListDto (
    val id: Long,
    val title: String,
    val author: String,
    val bookmark: Int
)
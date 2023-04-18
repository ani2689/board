package com.ani.board.domain.board.domain.repository

import com.ani.board.domain.board.domain.entity.Board
import com.ani.board.domain.user.domain.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository : CrudRepository<Board, Long> {
    fun findByTitle(title: String): List<Board>
    fun findByAuthor(user: User): List<Board>
}
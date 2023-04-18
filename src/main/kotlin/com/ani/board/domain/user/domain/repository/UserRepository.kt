package com.ani.board.domain.user.domain.repository

import com.ani.board.domain.user.domain.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User,Long>{
    fun findByName(name: String): User
}
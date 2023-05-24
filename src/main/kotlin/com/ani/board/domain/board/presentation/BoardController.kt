package com.ani.board.domain.board.presentation

import com.ani.board.domain.board.presentation.data.request4.CreateBoardRequestDto
import com.ani.board.domain.board.presentation.data.request4.UpdateBoardRequestDto
import com.ani.board.domain.board.presentation.data.response.BoardListResponseDto
import com.ani.board.domain.board.presentation.data.response.DetailBoardResponseDto
import com.ani.board.domain.board.service.*
import com.ani.board.domain.board.utils.BoardConverter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/board")
class BoardController (
    private val boardConverter: BoardConverter,
    private val createBoardService: CreateBoardService,
    private val deleteBoardService: DeleteBoardService,
    private val findAllBoardService: FindAllBoardService,
    private val findBoardByIdService: FindBoardByIdService,
    private val updateBoardService: UpdateBoardService,
    private val addBookmarkBoardService: AddBookmarkBoardService,
    private val removeBookmarkBoardService: RemoveBookmarkBoardService
){
    @PostMapping
    fun createBoard(@Valid @RequestBody createBoardRequestDto: CreateBoardRequestDto): ResponseEntity<Void> =
        boardConverter.toDto(createBoardRequestDto)
            .let{ createBoardService.execute(it) }
            .let{ ResponseEntity(HttpStatus.CREATED) }

    @GetMapping
    fun findAllBoard(): ResponseEntity<List<BoardListResponseDto>> =
        findAllBoardService.execute()
            .map{ boardConverter.toResponseDto(it) }
            .let{ ResponseEntity.ok().body(it) }

    @GetMapping("/{board_id}")
    fun findBoardById(@PathVariable("board_id") boardId: Long): ResponseEntity<DetailBoardResponseDto> =
        findBoardByIdService.execute(boardId)
            .let{ boardConverter.toResponseDto(it) }
            .let{ ResponseEntity.ok().body(it) }

    @PutMapping("/{board_id}")
    fun updateBoard(@PathVariable("board_id") boardId: Long,@Valid @RequestBody updateBoardRequestDto: UpdateBoardRequestDto): ResponseEntity<Void> =
        boardConverter.toDto(updateBoardRequestDto)
            .let{ updateBoardService.execute(boardId, it) }
            .let{ ResponseEntity.noContent().build() }

    @DeleteMapping("/{board_id}")
    fun deleteBoard(@PathVariable("board_id") boardId: Long): ResponseEntity<Void> =
        deleteBoardService.execute(boardId)
            .let{ ResponseEntity.noContent().build() }

    @PostMapping("/{board_id}/bookmark")
    fun addBookmarkBoard(@PathVariable("board_id") boardId: Long): ResponseEntity<Void> =
        addBookmarkBoardService.execute(boardId)
            .let{ ResponseEntity.noContent().build() }

    @DeleteMapping("/{board_id}/bookmark")
    fun removeBookmarkBoard(@PathVariable("board_id") boardId: Long): ResponseEntity<Void> =
        removeBookmarkBoardService.execute(boardId)
            .let{ ResponseEntity.noContent().build() }
}
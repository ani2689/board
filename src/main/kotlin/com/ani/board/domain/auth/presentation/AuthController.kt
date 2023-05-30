package com.ani.board.domain.auth.presentation

import com.ani.board.domain.auth.presentation.data.requestDto.LoginRequestDto
import com.ani.board.domain.auth.presentation.data.requestDto.SignupRequestDto
import com.ani.board.domain.auth.service.LoginService
import com.ani.board.domain.auth.service.LogoutService
import com.ani.board.domain.auth.service.SignupService
import com.ani.board.domain.auth.utils.AuthConverter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/auth")
class AuthController(
    val loginService: LoginService,
    val logoutService: LogoutService,
    val signupService: SignupService,
    val authConverter: AuthConverter
) {

    @PostMapping("/login")
    fun login(@Valid @RequestBody loginRequestDto: LoginRequestDto): ResponseEntity<Void> =
        authConverter.toDto(loginRequestDto)
            .let { loginService.execute(it) }
            .let { ResponseEntity(HttpStatus.CREATED) }

    @PostMapping("/signup")
    fun signup(@Valid @RequestBody signupRequestDto: SignupRequestDto): ResponseEntity<Void> =
        authConverter.toDto(signupRequestDto)
            .let { signupService.execute(it) }
            .let { ResponseEntity(HttpStatus.CREATED) }

    @DeleteMapping("/logout")
    fun logout(): ResponseEntity<Void> =
        logoutService.execute()
            .let { ResponseEntity.noContent().build() }
}
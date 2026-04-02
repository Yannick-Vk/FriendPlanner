package xyz.mitzie.services

import xyz.mitzie.dto.LoginRequest
import xyz.mitzie.dto.LoginResponse
import xyz.mitzie.dto.RegisterRequest
import xyz.mitzie.dto.RegisterResponse

fun login(request: LoginRequest): LoginResponse {
    return LoginResponse()
}

fun register(request: RegisterRequest): RegisterResponse {
    return RegisterResponse()
}

fun getUserData() {}


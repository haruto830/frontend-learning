package com.todo.backend.usecase

data class GetTodoResponse(
    val id: Int,
    val title: String,
    val description: String,
    val isDone: Boolean
)

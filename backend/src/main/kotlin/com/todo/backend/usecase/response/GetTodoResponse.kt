package com.todo.backend.usecase.response

data class GetTodoResponse(
    val id: Int,
    val title: String,
    val description: String,
    val isDone: Boolean
)

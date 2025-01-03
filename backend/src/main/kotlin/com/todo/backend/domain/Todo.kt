package com.todo.backend.domain

data class Todo(
    val id: Int,
    val title: String,
    val description: String,
    val isCompleted: Boolean
)
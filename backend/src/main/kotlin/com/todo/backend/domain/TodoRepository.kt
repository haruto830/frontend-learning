package com.todo.backend.domain

interface TodoRepository {
    fun findAll(): List<Todo>
}

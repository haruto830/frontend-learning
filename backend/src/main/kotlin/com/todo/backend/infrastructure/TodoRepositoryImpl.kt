package com.todo.backend.infrastructure

import com.todo.backend.domain.Todo
import com.todo.backend.domain.TodoRepository
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(private val mapper: TodoMapper) : TodoRepository {
    override fun findAll(): List<Todo> {
        return mapper.selectAll()
    }
}

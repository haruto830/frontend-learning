package com.todo.backend.usecase

import com.todo.backend.domain.Todo
import com.todo.backend.domain.TodoRepository
import com.todo.backend.usecase.response.GetTodoResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class GetTodoUseCase(private val todoRepository: TodoRepository) {
    @Transactional(readOnly = true)
    fun execute(): List<GetTodoResponse> {
        val todos = todoRepository.findAll()
        return todos.map { convertToResponse(it) }
    }

    private fun convertToResponse(todo: Todo): GetTodoResponse {
        return GetTodoResponse(todo.id, todo.title, todo.description, todo.isCompleted)
    }
}

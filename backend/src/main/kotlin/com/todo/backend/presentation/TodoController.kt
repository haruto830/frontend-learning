package com.todo.backend.presentation

import com.todo.backend.usecase.GetTodoUseCase
import com.todo.backend.usecase.response.GetTodoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(private val getTodoUseCase: GetTodoUseCase) {

    @GetMapping("/todos")
    fun getTodos(): List<GetTodoResponse> {
        return getTodoUseCase.execute()
    }
}

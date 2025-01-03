package com.todo.backend.presentation

import com.todo.backend.usecase.GetTodoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {

    @GetMapping("/todos")
    fun getTodos(): List<GetTodoResponse> {
        return listOf(GetTodoResponse(1, "タイトル", "テスト", false))
    }
}

package com.todo.backend.infrastructure

import com.todo.backend.domain.Todo
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface TodoMapper {

    @Select("SELECT * FROM TODOS")
    fun selectAll(): List<Todo>
}
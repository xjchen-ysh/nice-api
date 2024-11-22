package com.zyr.nice.module.core.service

import com.zyr.nice.module.core.dao.TodoRepository
import com.zyr.nice.module.core.model.Todo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodoService @Autowired constructor(private val todoRepository: TodoRepository) {

    fun findPage(page: Int, pageSize: Int): Page<Todo> {
        val pageable = PageRequest.of(page, pageSize)
        return todoRepository.findAll(pageable)
    }

    fun findAllTodos(): List<Todo> {
        return todoRepository.findAll()
    }

    fun findById(id: Long): Todo? {
        return todoRepository.findById(id).orElse(null)
    }

    fun save(todo: Todo) {
        todoRepository.save(todo)
    }


}
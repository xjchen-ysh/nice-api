package com.zyr.nice.module.note.controller

import com.zyr.nice.module.core.model.ResponseDTO
import com.zyr.nice.module.core.service.TodoService
import com.zyr.nice.module.note.model.TodoDTO
import com.zyr.nice.module.note.model.TodoVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class NoteController @Autowired constructor(private val todoService: TodoService) {


    @GetMapping("/todos")
    fun list(): ResponseDTO<List<TodoVO>> {
        return ResponseDTO<List<TodoVO>>(
            listOf(
                TodoVO(null, "title 1", "content 1111"),
                TodoVO(null, "title 2", "content 2222"),
                TodoVO(null, "title 3", "content 3333")
            ), "success", true
        )
    }

    @GetMapping("/todo/{id}")
    fun getById(@PathVariable id: Long): ResponseDTO<TodoVO> {

        println("id: $id")

        var todo = todoService.findById(id)
        println(todo)

        return ResponseDTO<TodoVO>(
//            TodoVO(todo.id ?: null, todo.title ?: "ccc", todo.content ?: "ccc"),
            TodoVO(null, "ccc", "ccc"),
            "success",
            true
        )
    }

    @PostMapping("/todo")
    fun save(@RequestBody todo: TodoDTO): ResponseDTO<String> {

        println("todo $todo")

        return ResponseDTO<String>("保存成功", "success", true)
    }

    @DeleteMapping("/todo/{id}")
    fun del(@PathVariable("id") id: Long): ResponseDTO<String> {

        println("id: $id")

        return ResponseDTO<String>("删除成功", "success", true)
    }
}
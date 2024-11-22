package com.zyr.nice.module.core.dao

import com.zyr.nice.module.core.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query

interface TodoRepository : JpaRepository<Todo, Long> {

    @Modifying
    @Query("UPDATE Todo SET content = NULL WHERE id = :id")
    fun setContentNull(id: Long)

}
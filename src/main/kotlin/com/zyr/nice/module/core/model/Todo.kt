package com.zyr.nice.module.core.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Todo(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = null,
    var title: String,
    var content: String
)

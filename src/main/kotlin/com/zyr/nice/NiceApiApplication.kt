package com.zyr.nice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NiceApiApplication

fun main(args: Array<String>) {
    runApplication<NiceApiApplication>(*args)
}

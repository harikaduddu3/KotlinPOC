package com.perficient.kotlinPOC

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@ComponentScan("com.perficient.kotlinPOC.controller","com.perficient.kotlinPOC.service","com.perficient.kotlinPOC.utils")
@Configuration
class KotlinPocApplication

fun main(args: Array<String>) {
	runApplication<KotlinPocApplication>(*args)
}

package com.perficient.kotlinPOC.controller


import com.perficient.kotlinPOC.service.KafkaProducer
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/kafka")
class KafkaController(val kafkaProducer: KafkaProducer){
    @GetMapping("/event")
    fun sendKafkaEvent(@RequestParam("msg") msg: String): ResponseEntity<String> {
        kafkaProducer.sendEvent(msg)
        return ResponseEntity("Message sent by kafka", HttpStatus.OK)
    }
}
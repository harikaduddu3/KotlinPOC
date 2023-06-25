package com.perficient.kotlinPOC.service

import com.perficient.kotlinPOC.utils.AppConstants
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(val kafkaTemplate: KafkaTemplate<String, String>) {
    fun sendEvent(message: String) {
        kafkaTemplate.send(AppConstants.TOPIC_NAME,message)
    }
}

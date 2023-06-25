package com.perficient.kotlinPOC.service

import com.perficient.kotlinPOC.utils.AppConstants
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {
    private val logger = LoggerFactory.getLogger(this.javaClass)
    @KafkaListener(topics = [AppConstants.TOPIC_NAME], groupId = AppConstants.GROUP_ID)
    fun listen(msg:String){
        logger.info("Message Received - $msg")
    }
}

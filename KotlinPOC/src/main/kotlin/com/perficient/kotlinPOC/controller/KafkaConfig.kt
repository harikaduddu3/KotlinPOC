package com.perficient.kotlinPOC.controller

import com.perficient.kotlinPOC.utils.AppConstants
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaConfig {
    @Bean
    fun topicCreate(): NewTopic {
        return TopicBuilder.name(AppConstants.TOPIC_NAME).build()
    }
}
package com.kafka.example.springboot.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public final class KafkaConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "myfirsttopic", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("$$$$ => Consumed message: %s", message));
    }
}
package com.kafka.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kafka.example.springboot.service.KafkaProducerService;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message) {
        kafkaProducerService.send(message);

        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }

}
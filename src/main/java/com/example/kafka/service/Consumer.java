package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "${kafka.topic.testtopic}")
    public void receive(String payload) {
        System.out.println(payload);
    }

    @KafkaListener(topics = "${kafka.topic.advan}")
    public void receive2(String payload) {
        System.out.println(payload);
    }
}

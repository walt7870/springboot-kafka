package com.example.kafka.controller;

import com.example.kafka.service.Consumer;
import com.example.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    Producer producer;

    @Autowired
    Consumer consumer;

    @RequestMapping("publish")
    public void testPublish(@RequestParam String message){
        producer.send("ad","Hello I am advan "+ message);
        producer.send("basictopic",message);
//        return "";
    }

    @RequestMapping("customer")
//    @KafkaListener(topics = "${kafka.topic.testtopic}")
    public void receive(String payload) {
        System.out.println("Listener"+payload);
    }
}

package com.example.kafka_example.listener;

import com.example.kafka_example.model.User;
import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "kafka_1",groupId = "groupId1")
    public void listener(String msg) {
        System.out.println(msg);
    }

}

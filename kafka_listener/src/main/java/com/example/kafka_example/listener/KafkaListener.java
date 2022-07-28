package com.example.kafka_example.listener;

import com.example.kafka_example.model.User;
import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "kafka", groupId = "groupId1")
    public void listener(User user) {
        System.out.println("****************************" + user);
        System.out.println("askjhfdcjkhsdgjhfgsdf" + user);
    }

}

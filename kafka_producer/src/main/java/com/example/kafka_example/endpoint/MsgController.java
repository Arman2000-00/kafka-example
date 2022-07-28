package com.example.kafka_example.endpoint;

import com.example.kafka_example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @PostMapping
    public void sendOrder(@RequestBody User user){
        kafkaTemplate.send("kafka",user);
    }
}
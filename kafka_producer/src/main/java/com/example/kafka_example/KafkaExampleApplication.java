package com.example.kafka_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableKafka
public class KafkaExampleApplication {

//    @KafkaListener(topics="kafka")
//    public void msgListener(String msg){
//        System.out.println(msg);
//    }


    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }


}

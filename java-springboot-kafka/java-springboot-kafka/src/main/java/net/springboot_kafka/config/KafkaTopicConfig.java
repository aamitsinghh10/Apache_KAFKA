package net.springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic KafkaTopics(){
        //return TopicBuilder.name("Kafka-Topics").partitions(10).build();
        return TopicBuilder.name("Kafka-Topics").build();//here using by default partitions
    }
}

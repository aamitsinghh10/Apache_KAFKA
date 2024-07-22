package net.springboot_kafka.java_springboot_kafka.Kafka;

import net.springboot_kafka.java_springboot_kafka.Entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "Kafka-Topics-Json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json Message received -> %s",user.toString()));
    }
}

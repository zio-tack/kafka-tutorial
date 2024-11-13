package it.mediatech.kafka.kafka;

import it.mediatech.kafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(groupId = "${spring.kafka.consumer.group-id}", topics = {"${spring.kafka.topic.name.json}"})
    public void consume(User user) {
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));
    }
}

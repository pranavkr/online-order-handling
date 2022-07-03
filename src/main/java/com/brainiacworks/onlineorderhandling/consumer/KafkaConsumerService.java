package com.brainiacworks.onlineorderhandling.consumer;

import com.brainiacworks.onlineorderhandling.constant.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private static final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = AppConstants.ALL_FOOD_ORDERS_TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void processFoodOrder(String message) {
//        log.info("Processing the food order. Sending it to specific restaurant: {}", message);
        log.info("Food order received at restaurant: {}. The food is being prepared", message);
    }
}

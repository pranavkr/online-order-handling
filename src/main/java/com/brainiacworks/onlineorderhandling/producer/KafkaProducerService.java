package com.brainiacworks.onlineorderhandling.producer;

import com.brainiacworks.onlineorderhandling.constant.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final Logger log = LoggerFactory.getLogger(KafkaProducerService.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void generateFoodOrder(String foodOrderMessage) {
        log.info(String.format("Food Order being generated -> %s", foodOrderMessage));
        this.kafkaTemplate.send(AppConstants.ALL_FOOD_ORDERS_TOPIC_NAME, foodOrderMessage);
    }

    public void sendFoodOrderToSpecificRestaurant(String restaurantCode, String foodOrderMessage) {
//        log.info("sending food order request: {}, to the restaurant with code: {}", foodOrderMessage, restaurantCode);
        this.kafkaTemplate.send(restaurantCode, foodOrderMessage);
    }
}

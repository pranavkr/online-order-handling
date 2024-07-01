package com.brainiacworks.onlineorderhandling.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.brainiacworks.onlineorderhandling.producer.KafkaProducerService;


@RestController
@RequestMapping("/food")
public class FoodRequestController {
    private static final Logger log = LoggerFactory.getLogger(FoodRequestController.class);

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/place-order")
    public void placeFoodOrder(@RequestParam("message") String message) {
        log.info("Received food order. Sending the request for further processing. This message will be sent to Kafka");
        this.kafkaProducerService.generateFoodOrder(message);
    }
}

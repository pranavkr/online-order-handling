package com.brainiacworks.onlineorderhandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineOrderHandlingApplication {

	private static final Logger log = LoggerFactory.getLogger(OnlineOrderHandlingApplication.class);
	public static void main(String[] args) {

		log.info("Starting the 'online-order-handling' application");
		SpringApplication.run(OnlineOrderHandlingApplication.class, args);
		log.info("Successfully started the 'online-order-handling' application");

	}

}

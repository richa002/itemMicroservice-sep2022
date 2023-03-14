package com.example.itemMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemMsApplication.class, args);
	}

}

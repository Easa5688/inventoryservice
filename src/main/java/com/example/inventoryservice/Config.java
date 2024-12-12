package com.example.inventoryservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean
     RestTemplate rest() {
		
		return new RestTemplate();
	}

}

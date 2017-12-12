package com.kumar.rest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(RestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return  args -> {
			Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			logger.info(quote.toString());
		};
	}
	
}


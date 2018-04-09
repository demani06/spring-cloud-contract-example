package com.deepak.consumerofcloudcontractexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerOfCloudContractExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerOfCloudContractExampleApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

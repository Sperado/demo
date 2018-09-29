package com.sperado.demo.epay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoEpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEpayApplication.class, args);
	}
}

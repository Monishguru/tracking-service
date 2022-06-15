package com.dhl.test.trackingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TrackingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackingserviceApplication.class, args);
	}

}

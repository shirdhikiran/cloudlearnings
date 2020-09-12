package com.cloudlearnings.eurekaserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverexampleApplication.class, args);
	}

}

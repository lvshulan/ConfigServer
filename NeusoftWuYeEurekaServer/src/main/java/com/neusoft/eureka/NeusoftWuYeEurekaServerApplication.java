package com.neusoft.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NeusoftWuYeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeusoftWuYeEurekaServerApplication.class, args);
	}

}

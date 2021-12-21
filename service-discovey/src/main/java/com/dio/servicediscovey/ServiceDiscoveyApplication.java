package com.dio.servicediscovey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveyApplication.class, args);
	}

}

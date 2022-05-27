package com.ibm.academia.apirest.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayServerTarjetasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerTarjetasApplication.class, args);
	}

}

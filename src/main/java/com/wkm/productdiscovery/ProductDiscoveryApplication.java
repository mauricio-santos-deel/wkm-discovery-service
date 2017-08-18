package com.wkm.productdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProductDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDiscoveryApplication.class, args);
	}

}

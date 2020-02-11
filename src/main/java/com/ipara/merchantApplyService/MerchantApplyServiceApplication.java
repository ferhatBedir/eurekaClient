package com.ipara.merchantApplyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MerchantApplyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantApplyServiceApplication.class, args);
	}

}

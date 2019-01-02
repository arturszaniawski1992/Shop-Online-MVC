package com.szaniawski.artur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopOnlineApplication {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "mysql");
		SpringApplication.run(ShopOnlineApplication.class, args);
	}

}


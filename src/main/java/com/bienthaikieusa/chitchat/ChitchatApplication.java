package com.bienthaikieusa.chitchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ChitchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChitchatApplication.class, args);
	}

}

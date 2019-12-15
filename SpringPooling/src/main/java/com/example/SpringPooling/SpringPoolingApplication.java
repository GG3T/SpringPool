package com.example.SpringPooling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling

@SpringBootApplication
public class SpringPoolingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPoolingApplication.class, args);
	}

}

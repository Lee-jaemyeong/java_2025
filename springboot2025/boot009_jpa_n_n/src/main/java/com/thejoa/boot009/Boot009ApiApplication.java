package com.thejoa.boot009;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Boot009ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot009ApiApplication.class, args);
	}

}

package com.sweetspot.sweetspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.sweetspot.sweetspot.entity")

public class SweetspotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SweetspotApplication.class, args);
	}

}

package com.example.spd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpdApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "its working ";
	
	}
	public static void main(String[] args) {
		SpringApplication.run(SpdApplication.class, args);
	}

}

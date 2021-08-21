package com.mapanip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEbsDemoApplication {

	@GetMapping("/status")
	public String deply()
	{
		return "EBS deploy working";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEbsDemoApplication.class, args);
	}

}

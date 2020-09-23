package com.sada.springbootdockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootdockerimageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerimageApplication.class, args);
	}
	@RestController
	static final class MyController{
		@GetMapping("/index")
		String hello()
		{
			return ("");
		}
	}
}

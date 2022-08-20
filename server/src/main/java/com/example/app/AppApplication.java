package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class AppApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

	@RequestMapping("/tests/{param}")
	private String testParamVariable(@PathVariable String param) {
		return "return + " + param;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}

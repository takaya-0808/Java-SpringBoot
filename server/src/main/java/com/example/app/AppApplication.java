package com.example.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@SpringBootApplication
@RestController
public class AppApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

	@RequestMapping(value="/index", method=RequestMethod.GET) 
	public String HelloGetWorld(Model model) {
		return "index";
	}

	@RequestMapping("/tests/{param}")
	private String testParamVariable(@PathVariable String param) {
		return "return + " + param;
	}

	@RequestMapping(value="/resource/{id}", method=RequestMethod.GET)
	private String read(@PathVariable String id) {
		return "reference: " + id;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}

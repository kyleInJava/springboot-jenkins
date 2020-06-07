package com.jenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}
	
	@GetMapping("hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello" +name;
	}

}

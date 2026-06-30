package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hi")
	public String sayHello(){
		return "Hello, World!";
	}

}
// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class HelloController {

//     @GetMapping("/")
//     public String home() {
//         return "Welcome to Spring Boot!";
//     }

//     @GetMapping("/hello")
//     public String hello() {
//         return "Hello World";
//     }
// }
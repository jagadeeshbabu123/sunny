package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DevlopApApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevlopApApplication.class, args);
		
	}
	

	@RequestMapping(path = "/hh",method=RequestMethod.GET)
	public String wishMsg(){
		return "Hello worldasdgad";
	}
	
	
	
}

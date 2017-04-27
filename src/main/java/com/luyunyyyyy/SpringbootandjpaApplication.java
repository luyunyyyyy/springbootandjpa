package com.luyunyyyyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootandjpaApplication {
	@RequestMapping(
			"/hello"
	)
	public String getHello(){
		return "hello 马爽";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootandjpaApplication.class, args);
	}
}

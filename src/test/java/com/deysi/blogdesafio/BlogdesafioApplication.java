package com.deysi.blogdesafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages =  { "com.deysi.blogdesafio.model"})
public class BlogdesafioApplication {
	public static void main(String[] args) {
		

		SpringApplication.run(BlogdesafioApplication.class, args);
	}

}

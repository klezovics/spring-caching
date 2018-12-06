package com.klezovich.spring_cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.klezovich.spring_cache.service.UserService;

@SpringBootApplication
public class SpringCacheTestApplication implements CommandLineRunner {

	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCacheTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String userName = "Arthur";
		
		
	}
}

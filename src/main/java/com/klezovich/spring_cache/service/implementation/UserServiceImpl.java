package com.klezovich.spring_cache.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.klezovich.spring_cache.entity.User;
import com.klezovich.spring_cache.repository.UserRepository;
import com.klezovich.spring_cache.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findByName(String name) {
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		return userRepository.findByName(name);
	}

}

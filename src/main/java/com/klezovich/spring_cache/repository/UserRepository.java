package com.klezovich.spring_cache.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.klezovich.spring_cache.entity.User;

@Component
public class UserRepository {

	private static List<User> users = new ArrayList<>();
	
	static {
		users.add( new User("Arthur", "secret1"));
		users.add( new User("Bulakh", "iLoveMarisha"));
	}
	
	public User findByName( String name ) {
		for( User u : users ) {
			if( u.getName().equals(name) )
				return u;
		}
		
		return null;
	}
}

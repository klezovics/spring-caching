package com.klezovich.spring_cache.service;

import com.klezovich.spring_cache.entity.User;

public interface UserService {

	User findByName( String name );
}

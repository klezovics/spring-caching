package com.klezovich.spring_cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.klezovich.spring_cache.entity.User;
import com.klezovich.spring_cache.service.UserService;

@SpringBootApplication
public class SpringCacheTestApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("fastUserService")
	UserService fastUserService;
	
	@Autowired
	@Qualifier("slowUserService")
	UserService slowUserService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCacheTestApplication.class, args);
	}

	
	private void timeService( UserService us, String userName, long numIter ) {
		long start = System.currentTimeMillis();
		for( long ii=0; ii<numIter; ii++ ) {
			User u = us.findByName(userName);
		}
		long finish = System.currentTimeMillis();
		System.out.println( us.getClass().getSimpleName() + " completion time(ms):" + (finish-start));
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		String userName = "Arthur";
		long numIter = 1000;
		
		timeService(slowUserService, userName, numIter);
	    timeService(fastUserService, userName, numIter);
		
		
	}
}

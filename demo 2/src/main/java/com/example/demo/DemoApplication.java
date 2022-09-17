package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
	private UserDao userDao;
	@Override
	public void run(String... args) throws Exception {
		this.userDao.save(new User("ramesh", "Fadatrea", "example@example.com"));
		this.userDao.save(new User("bill", "burr", "example@example.com"));
		this.userDao.save(new User("jack", "dempsy", "example@example.com"));


	}
}

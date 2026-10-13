package com.example.demo.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repo.UserRepo;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	 private UserRepo userRepo;

	    public UserServiceImpl(UserRepo userRepo) {
	        this.userRepo = userRepo;
	    }

	@Override
	public User saveUser(User user) {
		userRepo.save(user);
		return user;
	}

	@Override
	public User loginUser(String email, String password) {
		User user=userRepo.findUserByEmailAndPassword(email, password);
		
		return user;
	}

}

package com.example.demo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface UserRepo extends MongoRepository<User	, String> {
	
	User findUserByEmailAndPassword(String email,String password);
}

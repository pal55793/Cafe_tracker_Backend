package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.impl.UserServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserController {	
	
	@Autowired
	UserServiceImpl userService;

	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody User user){
		 user=userService.loginUser(user.getEmail(), user.getPassword());
		 Map<String, String>message=new HashMap<String, String>();
		if(user==null) {
			message.put("message", "Login Failed");
			return new ResponseEntity<Object>(message,HttpStatus.UNAUTHORIZED);
		}else {
			message.put("message", "Login Successfully");
			return new ResponseEntity<Object>(message,HttpStatus.OK);
		}
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user){
		userService.saveUser(user);
		
		return new ResponseEntity<User>(HttpStatus.OK);
	}
}

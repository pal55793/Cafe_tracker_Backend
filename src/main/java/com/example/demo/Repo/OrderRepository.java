package com.example.demo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}

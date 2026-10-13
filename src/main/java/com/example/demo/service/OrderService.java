package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Order;

public interface OrderService {

	Order create(Order order);
	
	Order update(String id, Order category);

    Optional<Order> getById(String id);

    List<Order> getAll();

    void delete(String id); 
	
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private final OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService=orderService;
	}
	
	@Operation(summary = "Create order for Costumer ", description = "Create New Order for every Costumer")
	@PostMapping("/createOrder")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		if(order==null) {
			
			return new ResponseEntity<Order>(HttpStatus.BAD_REQUEST);
			
		}
		orderService.create(order);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}
	
	@GetMapping("/allOrders")
	public ResponseEntity<List<Order>> allOrders() {
		List<Order> orders=orderService.getAll();
		return new ResponseEntity<List<Order>>(orders,HttpStatus.OK);
	}
}

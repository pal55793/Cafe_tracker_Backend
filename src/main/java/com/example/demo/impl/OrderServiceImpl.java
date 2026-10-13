package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Repo.OrderRepository;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderItem;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;
	
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository=orderRepository;
	}
	
	@Override
	public Order create(Order order) {
		
		List<OrderItem>items=order.getItems();
		Double total=items.stream().mapToDouble(item->item.getQuantity() * item.getUnitPrice()).sum();
		order.setId(order.getId());
		order.setTotalBill(total);
		order.setItems(items);
		
		return orderRepository.save(order);
	}

	@Override
	public Order update(String id, Order category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Order> getById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Order> getAll() {
		
		return orderRepository.findAll();
	}

	@Override
	public void delete(String id) {
		if(orderRepository.findById(id)!=null) {
			orderRepository.deleteById(id);
		}
		
	}

}

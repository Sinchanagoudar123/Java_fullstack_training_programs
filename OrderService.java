package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
@Service
@Transactional

public class OrderService {
 private OrderRepository repository;
 @Autowired
 public OrderService(OrderRepository repository)
	{
		this.repository=repository;
	}

	public List<Order> listAll() {
		
		return repository.findAll();
	}

	public Order get(Integer id) {
		
		return repository.findById(id).get();
	}

	public void save(Order order) {
	
		repository.save(order);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	
}

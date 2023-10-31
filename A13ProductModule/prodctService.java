package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class productService {
	private productRepository repository;
	@Autowired
	 public productService(productRepository repository)
		{
			this.repository=repository;
		}
	
	public List<product>listAll()
	{
		return repository.findAll();
	}
	public product get(Integer id)
	{
		return repository.findById(id).get();
	}
	public void save(product product)
	{
		repository.save(product);
	}
	public void delete(Integer id)
	{
		repository.deleteById(id);
	}
}

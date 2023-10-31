package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
	@Autowired
private productService service;
	@GetMapping("/products")
	public List<product> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<product>get(@PathVariable Integer id){
		try
	
	{
		product product=service.get(id);
		return new ResponseEntity<product>(product,HttpStatus.OK);
	}
		catch(Exception e) {
			return new ResponseEntity<product>(HttpStatus.NOT_FOUND);
		}		
		
 }
	@PostMapping("/products")
	public void add(@RequestBody product product)
	{
		service.save(product);
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<?>update (@RequestBody product product,@PathVariable Integer id)
	{
		try
		{
			product existproduct=service.get(id);
			service.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}


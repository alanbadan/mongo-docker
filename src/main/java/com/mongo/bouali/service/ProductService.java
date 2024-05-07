package com.mongo.bouali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.bouali.model.Product;
import com.mongo.bouali.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;

	
	public String save(Product product) {
		return repository.save(product).getId();
		
	}
	
	public Product findById(String id) {
		return repository.findById(id).orElse(null);
	
	}
	
	public List<Product>listProduct(){
		return repository.findAll();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	
	
}

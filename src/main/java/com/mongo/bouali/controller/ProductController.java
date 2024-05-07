 package com.mongo.bouali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.bouali.model.Product;
import com.mongo.bouali.service.ProductService;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		return ResponseEntity.ok(productService.save(product));
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok(productService.listProduct());
	}
    
	@GetMapping("/{product-id}")
	public ResponseEntity<Product> findById(@PathVariable ("product-id")String id){
		return ResponseEntity.ok(productService.findById(id));
	}
	
	@DeleteMapping("/{product-id}")
	public ResponseEntity<Void> delete(@PathVariable ("product-id") String id){
		productService.delete(id);
		return ResponseEntity.accepted().build();
	}
}

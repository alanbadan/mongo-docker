package com.mongo.bouali.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.bouali.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}

package com.mongo.bouali.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.bouali.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{

}

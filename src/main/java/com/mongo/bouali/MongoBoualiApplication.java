package com.mongo.bouali;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mongo.bouali.model.Category;
import com.mongo.bouali.model.Product;
import com.mongo.bouali.repository.CategoryRepository;
import com.mongo.bouali.repository.ProductRepository;

@SpringBootApplication
public class MongoBoualiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoBoualiApplication.class, args);
	}
	
//	@Bean
	public CommandLineRunner commandLineRunner(ProductRepository productRepository, CategoryRepository categoryRepository) {
		
		return args -> {
			var category =  Category.builder()
					.name("cat 1")
					.decription("cat 1")
					.build();
			
			var category2 = Category.builder()
			         .name("cat 2")
			         .decription("cat 2")
			         .build();
			categoryRepository.insert(category);
			categoryRepository.insert(category2);
					
			var product = Product.builder()
					.name("Iphone")
					.decription("Smart phone")
					.build();
			productRepository.insert(product);
			
		};
	}

}

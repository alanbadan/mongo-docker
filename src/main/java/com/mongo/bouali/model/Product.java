package com.mongo.bouali.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@Builder
public class Product {
	
	@Id
	private String id;
	private String name;
	private String decription;
	private List<Product>tags;
	//fazendo o lonk engtre o produtoe a categoria
	@DBRef
	private Category category;

}

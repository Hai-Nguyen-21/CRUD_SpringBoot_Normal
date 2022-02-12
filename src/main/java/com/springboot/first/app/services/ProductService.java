package com.springboot.first.app.services;

import java.util.List;

import com.springboot.first.app.models.products;

public interface ProductService {

	products saveProduct(products products);
	
	List<products> getAllProducts();
	
	products getProductById(int id);
	
	void deleteProductById(int id);
}

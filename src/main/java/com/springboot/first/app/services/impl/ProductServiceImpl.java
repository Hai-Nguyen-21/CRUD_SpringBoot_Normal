package com.springboot.first.app.services.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.first.app.models.products;
import com.springboot.first.app.repositories.ProductRepository;
import com.springboot.first.app.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public products saveProduct(products products) {
		return this.productRepository.save(products);
	}

	@Override
	public List<products> getAllProducts() {
		return this.productRepository.findAll();
	}
 
	@Override
	public products getProductById(int id) {
		Optional<products> optional = this.productRepository.findById(id);
		products p = null;
		if(optional.isPresent()) {
			p = optional.get();
		} else {
			throw new RuntimeException("Product not found for id: "+ id);
		}
		return p;
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		this.productRepository.deleteById(id);
	}

}

package com.springboot.first.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.first.app.models.categories;
import com.springboot.first.app.repositories.CategoryRepository;
import com.springboot.first.app.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<categories> getAllCate() {
		return this.categoryRepository.findAll();
	}

}

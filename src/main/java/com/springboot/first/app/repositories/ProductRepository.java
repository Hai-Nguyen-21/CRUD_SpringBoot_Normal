package com.springboot.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.first.app.models.products;

@Repository
public interface ProductRepository extends JpaRepository<products, Integer>{

	
}

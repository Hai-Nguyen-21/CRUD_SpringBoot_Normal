package com.springboot.first.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.first.app.models.categories;

@Repository
public interface CategoryRepository extends JpaRepository<categories, Integer>{

}

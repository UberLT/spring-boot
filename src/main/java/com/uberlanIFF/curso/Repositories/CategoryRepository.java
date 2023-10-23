package com.uberlanIFF.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberlanIFF.curso.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

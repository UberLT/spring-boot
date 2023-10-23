package com.uberlanIFF.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberlanIFF.curso.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

package com.uberlanIFF.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberlanIFF.curso.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

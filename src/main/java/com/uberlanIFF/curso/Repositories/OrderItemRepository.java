package com.uberlanIFF.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberlanIFF.curso.Entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}

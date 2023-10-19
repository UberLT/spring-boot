package com.uberlanIFF.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberlanIFF.curso.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

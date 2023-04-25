package com.devsuperior.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.coursewebservice.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}

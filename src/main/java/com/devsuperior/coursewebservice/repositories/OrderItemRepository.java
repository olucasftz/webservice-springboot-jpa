package com.devsuperior.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.coursewebservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}

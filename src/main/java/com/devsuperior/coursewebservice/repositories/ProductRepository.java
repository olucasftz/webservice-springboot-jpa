package com.devsuperior.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.coursewebservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

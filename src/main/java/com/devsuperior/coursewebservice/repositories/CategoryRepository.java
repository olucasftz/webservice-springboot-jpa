package com.devsuperior.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.coursewebservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

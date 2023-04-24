package com.devsuperior.coursewebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.coursewebservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}

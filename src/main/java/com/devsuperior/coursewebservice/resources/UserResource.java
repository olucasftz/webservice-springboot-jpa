package com.devsuperior.coursewebservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.coursewebservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> finAll() {
		
		User u = new User(1L, "Charlote", "linlin@mama.com", "9999-9999", "luffy");
		return ResponseEntity.ok().body(u);
	}
}

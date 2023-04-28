package com.devsuperior.coursewebservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.devsuperior.coursewebservice.entities.User;
import com.devsuperior.coursewebservice.repositories.UserRepository;
import com.devsuperior.coursewebservice.services.exceptions.DatabaseException;
import com.devsuperior.coursewebservice.services.exceptions.ResourceNotFoundException;


@Service
public class UserService {

	@Autowired 
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
	    try {
	        if (repository.existsById(id)) {
	            repository.deleteById(id);			
	        } else {				
	            throw new ResourceNotFoundException(id);			
	        }		
	    } catch (DataIntegrityViolationException e) {			
	        throw new DatabaseException(e.getMessage());		
	    }	
	}
	
	public User update(Long id, User obj) {
		try {
			if(repository.existsById(id)) {
				User entity = repository.getReferenceById(id);
				updateData(entity, obj);
				return repository.save(entity);
			} else {
				throw new ResourceNotFoundException(id);
			}	
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());	
	}
}

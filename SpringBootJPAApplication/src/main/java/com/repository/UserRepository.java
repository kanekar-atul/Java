package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public List<User> findByCity(String city);
 
}
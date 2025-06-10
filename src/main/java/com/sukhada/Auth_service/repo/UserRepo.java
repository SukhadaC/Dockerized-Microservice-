package com.sukhada.Auth_service.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sukhada.Auth_service.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	
	public Optional<User> findByUsername(String username);
	
	

}

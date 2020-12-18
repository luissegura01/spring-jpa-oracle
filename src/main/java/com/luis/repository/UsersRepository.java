package com.luis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.luis.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	Optional<Users> findById(Integer id);

}

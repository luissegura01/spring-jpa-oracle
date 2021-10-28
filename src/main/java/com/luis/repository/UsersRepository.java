package com.luis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.luis.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	List<Users> findAll();

	Optional<Users> findById(Integer id);

	Users save(Users user);

	void deleteById(Integer id);

	void deleteAll();

}

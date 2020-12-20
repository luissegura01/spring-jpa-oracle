package com.luis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.model.Users;
import com.luis.repository.UsersRepository;

@Service 
public class UsersService {
	
	@Autowired 
	private UsersRepository usersRepository;
	
	public List<Users> getAllUsers(){
		return usersRepository.findAll();
	}
	
	
	public Optional<Users> getUserById(Integer id){
		return usersRepository.findById(id);
	}
	
	
	public Users saveUser(Users user) {
		return usersRepository.save(user);
	}
	
	public void deleteUser(Integer id) {
		usersRepository.deleteById(id);
	}
}

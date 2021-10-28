package com.luis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.luis.model.Users;
import com.luis.repository.UsersRepository;
import com.luis.service.UsersService;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {
	
	@Autowired
	UsersService usersService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Users>> getAll(){
		List<Users> userList;
		userList = usersService.getAllUsers();
		return new ResponseEntity(userList, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/byid/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Users>> findById(@PathVariable Integer id) {
		Optional<Users> user;
		user = usersService.getUserById(id);
		
		return new ResponseEntity(user, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value= "/create", method = RequestMethod.POST)
	public ResponseEntity<Users> createUser(@RequestBody Users user){
		Users user1;
		
		user1 = usersService.saveUser(user);
		return new ResponseEntity(user1, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value= "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity deleteUser(@PathVariable Integer id) {
		usersService.deleteUser(id);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value= "/delete/all", method = RequestMethod.DELETE)
	public ResponseEntity deleteAllUsers() {
		usersService.deleteAll();
		return new ResponseEntity(HttpStatus.OK);
	}
	


}

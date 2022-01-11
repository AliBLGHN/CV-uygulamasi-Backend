package com.example.cvuygulamasi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cvuygulamasi.models.User;
import com.example.cvuygulamasi.services.UserService;

@RequestMapping("/users")
@RestController

public class UserController {

		private UserService userService;
		
		public UserController(UserService userService) {
			this.userService=userService;
		}
		
		@GetMapping("")
		public List<User> getUsers(){
			return userService.getUsers();
		}
		
		@GetMapping("/{id}")
		public User getUser(@PathVariable Integer id) {
			//exception
			return userService.getUser(id);
		}
		
		@PostMapping("/login")
		public User loginUser(@RequestBody User loginUser){
			
			return userService.loginUser(loginUser);
		}
		
		@PostMapping("/register")
		public User registerUser(@RequestBody User newUser) {
			return userService.registerUser(newUser);
		}
		
		
		
		@PutMapping("/{id}")
		public Integer updateUser(@PathVariable Integer id, @RequestBody User newUser) {
			return userService.updateUser(id, newUser);
		}
		
		@DeleteMapping("/{id}")
		public void deleteUser(@PathVariable Integer id) {
			userService.deleteUser(id);
		}
		
		
		
		
}

package com.Multiplex.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Multiplex.entites.Users;
import com.Multiplex.service.UserServices;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	private UserServices userServices;

	@RequestMapping("/user")
	public String user() {
	return "This is users list page";
	}
	@GetMapping("/users")
	public List<Users> getUsers() {
		return this.userServices.getUsers();
	}
	@GetMapping("/users/{userid}")
	public ResponseEntity getUserByID(@PathVariable ("userid") int user_id) {
		return new ResponseEntity(userServices.getUserByID(user_id),HttpStatus.OK);
	}
	 
	@PostMapping("/users")
	public  Users addUser(@RequestBody Users user) {
		return this.userServices.addUser(user);
	}
	@DeleteMapping("/users/{userid}")
	public void deleteUser(@PathVariable int userid) {
		this.userServices.deleteUser(userid);
		
	}
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users user) {
		return this.userServices.updateUser(user);
	}
	 @GetMapping("/userByName")
	  public List<Users> getUserByName(){
		  return this.userServices.getUserByName();
	  }
}

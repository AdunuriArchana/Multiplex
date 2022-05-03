package com.Multiplex.service;

import java.util.List;

import com.Multiplex.entites.Users;
import com.Multiplex.exceptions.UserNotFoundException;

public interface UserServices {
	public List<Users> getUsers();
	public Users getUserByID(int user_id) throws UserNotFoundException;
	public Users addUser(Users user);
	public void deleteUser(int user_id);
	public Users updateUser(Users user);
	public List<Users>getUserByName();
	}

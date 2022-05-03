package com.Multiplex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Multiplex.dao.UserDAO;
import com.Multiplex.entites.Users;
import com.Multiplex.exceptions.UserNotFoundException;


@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	private UserDAO usersDao;

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return usersDao.findAll();
		
	}

	@Override
	public Users getUserByID(int user_id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Users user;
		if(usersDao.findById(user_id).isEmpty()) {
			throw new UserNotFoundException();
		}
		else {
			user=usersDao.findById(user_id).get();
		}
		return user;
	}

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		usersDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(int userid) {
		// TODO Auto-generated method stub
		Users u=usersDao.getById(userid);
		usersDao.delete(u);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		usersDao.save(user);
		return user;
	}
	public List<Users> getUserByName() {
		// TODO Auto-generated method stub
		
		return usersDao.getUserByName();
	}

}

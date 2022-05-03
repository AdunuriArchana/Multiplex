package com.Multiplex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Multiplex.entites.Users;

public interface UserDAO extends JpaRepository<Users,Integer>{
	@Query("Select u from Users u where name='Archana'")
	List<Users>getUserByName();

}



package com.das.nic.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.nic.entities.User;
import com.das.nic.repositories.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Transactional
	public String saveUser(User user) {
		return userDao.saveUser(user);
	}
	@Transactional
	public boolean delete(User user) {
		return userDao.delete(user);
	}
	@Transactional
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}

}

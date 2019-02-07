package com.das.nic.repositories;

import java.util.List;



import com.das.nic.entities.User;

public interface UserDao {
	
	public String saveUser(User user);
	public boolean delete(User user);
	public List<User> getAllUsers();
}

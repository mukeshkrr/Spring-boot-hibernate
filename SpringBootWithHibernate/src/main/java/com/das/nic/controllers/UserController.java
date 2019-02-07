package com.das.nic.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.das.nic.entities.User;
import com.das.nic.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/save")
	public ModelAndView save() {
		ModelAndView mv = new ModelAndView();
		User user = new User("abc", "abc@abc.com", "123456", 20);
		userService.saveUser(user);
		mv.addObject("title", "Saved");
		mv.addObject("user", user);
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("/get")
	public ModelAndView get() {
		List<User> users = userService.getAllUsers();
		ModelAndView mv = new ModelAndView();
		mv.addObject("title","User List");
		mv.addObject("users",users);
		mv.setViewName("home");
		return mv;
	}

}

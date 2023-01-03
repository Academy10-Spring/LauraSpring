package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;



@Controller
public class WebController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String getHome(Model model) {
		
		return "home";
	}
	
	
	@GetMapping("/user")
	public String getFormUser(Model model) {
		List<User> userList = (List<User>) userRepository.findAll();
		model.addAttribute("users",userList);
		return "user/form";
	}
	
}

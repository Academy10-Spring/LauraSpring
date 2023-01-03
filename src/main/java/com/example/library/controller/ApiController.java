package com.example.library.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;

@RestController
@RequestMapping("api")
public class ApiController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value = "/addUser")
	public boolean addUser(@RequestParam Map<String, String> params) {
		try {
			//da implementare controllo che lo user non sia già esistente prima di creare un nuovo oggetto
			User user = new User(params.get("name"), params.get("surname"));
			return true;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return false;
	}
}

package com.example.library.bootstrapdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User userMario = new User("Mario", "Rossi");
		User userGiorgio = new User("Giorgio", "Bianchi");
		
		userRepository.save(userMario);
		userRepository.save(userGiorgio);
		
	}
}

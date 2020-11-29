package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user, Planet planet) {
		UserRepository.createUser(user, planet);
		return userRepository.save(user);
	}
	
	public Optional<User> search(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	public void deleteUser (Long id) {
		this.userRepository.deleteById(id);
	}
	
	public User updateUser (User user) {
		return this.userRepository.save(user);
	}

}

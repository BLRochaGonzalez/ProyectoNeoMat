package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User search(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	public void deleteUser (Long id) {
		this.userRepository.deleteById(id);
	}
	
	public User updateUser (User user) {
		return this.userRepository.save(user);
	}

}

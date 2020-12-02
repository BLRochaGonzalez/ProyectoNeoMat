package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Building;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SettlementService settlementService;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User search(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	public User searchById(Long id) {
		return this.userRepository.findFirstById(id);
		
	}
	
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
	}
	
	public User updateUser (User user) {
		return this.userRepository.save(user);
	}

	public List<User> listUsers() {
		return this.userRepository.findAllByRole("user");
	}
	
	public Page<User> findPaginated(int numPage, int pageSize){
		Pageable pageable = PageRequest.of(numPage-1, pageSize);
		return this.userRepository.findAll(pageable);
	}

}

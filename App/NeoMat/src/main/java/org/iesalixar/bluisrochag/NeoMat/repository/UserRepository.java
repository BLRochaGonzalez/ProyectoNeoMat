package org.iesalixar.bluisrochag.neomat.repository;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@SuppressWarnings("unchecked")
	public User save(User u);
	
	
	public User findByEmail(String email);


	public List<User> findAllByRole(String role);


	public User findFirstById(Long id);
	
}

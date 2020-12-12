package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService /*implements UserDetailsService */{

	@Autowired
	UserRepository userRepository;

	public org.iesalixar.bluisrochag.neomat.model.User createUser(org.iesalixar.bluisrochag.neomat.model.User user) {
		return userRepository.save(user);
	}

	public User search(String email) {
		return this.userRepository.findByEmail(email);
	}

	public org.iesalixar.bluisrochag.neomat.model.User searchById(Long id) {
		return this.userRepository.findFirstById(id);

	}

	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
	}

	public org.iesalixar.bluisrochag.neomat.model.User updateUser(org.iesalixar.bluisrochag.neomat.model.User user) {
		return this.userRepository.save(user);
	}

	public List<org.iesalixar.bluisrochag.neomat.model.User> listUsers() {
		return this.userRepository.findAllByRole("user");
	}

	public Page<org.iesalixar.bluisrochag.neomat.model.User> findPaginated(int numPage, int pageSize) {
		Pageable pageable = PageRequest.of(numPage - 1, pageSize);
		return this.userRepository.findAll(pageable);
	}

	public void save(User authUser) {
		this.userRepository.save(authUser);
	}

	public User findFirstById(Long id) {
		return this.userRepository.findFirstById(id);
	}

	public List<User> findAllOrderByPoints() {
		return this.userRepository.findAllByOrderByPointsDesc();
	}

	public List<User> findAllOrderByBuildingPoints() {
		return this.userRepository.findAllByOrderByBuildingPointsDesc();
	}

	public List<User> findAllOrderByResearchPoints() {
		return this.userRepository.findAllByOrderByResearchPointsDesc();
	}

	public List<User> findAllOrderByTroupPoints() {
		return this.userRepository.findAllByOrderByTroupPointsDesc();
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//
//		org.iesalixar.bluisrochag.neomat.model.User appUser = userRepository.findByEmail(email)
//				.orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
//
//		@SuppressWarnings("rawtypes")
//		List grantList = new ArrayList();
//		for (Role authority : appUser.getRole()) {
//			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getName());
//			grantList.add(grantedAuthority);
//		}
//
//		UserDetails user = (UserDetails) new User(appUser.getEmail(), appUser.getPassword(), grantList);
//		return user;
//	}

}

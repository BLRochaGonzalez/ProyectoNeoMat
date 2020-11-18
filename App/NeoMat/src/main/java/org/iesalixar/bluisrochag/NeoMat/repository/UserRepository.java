package org.iesalixar.bluisrochag.neomat.repository;

import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@SuppressWarnings("unchecked")
	public User save(User u);
	
	public static void createUser(User u, Planet pl) {
		u.setPlanet(pl);
		pl.setNumPlayers(pl.getNumPlayers() + 1);
		pl.getUsersId().add(u);
		return;
	}
}

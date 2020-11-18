package org.iesalixar.bluisrochag.neomat.repository;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettlementRepository extends JpaRepository<Settlement, Long>{

	@SuppressWarnings("unchecked")
	public Settlement save(Settlement s);

	public static void createSettlement(Settlement s, User u, Planet p, Location l) {
		p.setNumSettlements(p.getNumSettlements() + 1);
		u.getSettlementsId().add(s);
		s.setLocation(l);
		s.setUser(u);
		return;
	}

}
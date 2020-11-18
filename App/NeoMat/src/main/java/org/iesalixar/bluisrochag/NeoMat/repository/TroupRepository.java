package org.iesalixar.bluisrochag.neomat.repository;

import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TroupRepository extends JpaRepository<Troup, Long>{

	@SuppressWarnings("unchecked")
	public Troup save(Troup s);
}

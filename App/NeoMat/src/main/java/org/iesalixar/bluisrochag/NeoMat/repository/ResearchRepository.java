package org.iesalixar.bluisrochag.neomat.repository;

import org.iesalixar.bluisrochag.neomat.model.Research;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResearchRepository extends JpaRepository<Research, Long>{

	@SuppressWarnings("unchecked")
	public Research save(Research b);

}

package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.repository.TroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TroupService {

	@Autowired
	TroupRepository troupRepository;
	
	public List<Troup> listTroups() {
		return this.troupRepository.findAll();
	}
	
	public Page<Troup> findPaginated(int numPage, int pageSize){
		Pageable pageable = PageRequest.of(numPage-1, pageSize);
		return this.troupRepository.findAll(pageable);
	}

	public Troup findFirstById(Long id) {
		return this.troupRepository.findFirstById(id);
	}

	public List<Troup> findAll() {
		return this.troupRepository.findAll();
	}

	public void save(Troup tr) {
		this.troupRepository.save(tr);
	}
}

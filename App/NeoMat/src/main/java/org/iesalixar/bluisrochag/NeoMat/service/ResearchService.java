package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Research;
import org.iesalixar.bluisrochag.neomat.repository.ResearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResearchService {
	
	@Autowired
	ResearchRepository researchRepository;
	
	public List<Research> listResearches() {
		return this.researchRepository.findAll();
	}

	public Page<Research> findPaginated(int numPage, int pageSize){
		Pageable pageable = PageRequest.of(numPage-1, pageSize);
		return this.researchRepository.findAll(pageable);
	}

	public Research findFirstById(Long id) {
		return this.researchRepository.findFirstById(id);
	}

	public List<Research> findAll() {
		return this.researchRepository.findAll();
	}
}

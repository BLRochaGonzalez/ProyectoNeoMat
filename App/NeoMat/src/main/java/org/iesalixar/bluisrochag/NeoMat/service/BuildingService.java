package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Building;
import org.iesalixar.bluisrochag.neomat.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

	@Autowired
	BuildingRepository buildingRepository;
	
	public List<Building> listBuildings() {
		return this.buildingRepository.findAll();
	}
	
	public Page<Building> findPaginated(int numPage, int pageSize){
		Pageable pageable = PageRequest.of(numPage-1, pageSize);
		return this.buildingRepository.findAll(pageable);
	}
}

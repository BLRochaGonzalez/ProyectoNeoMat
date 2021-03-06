package org.iesalixar.bluisrochag.neomat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="building")
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buildingid")
	private Long id;
	
	@Column (name = "name", columnDefinition = "varchar(45)", nullable=false, unique=true)
	private String name;
	
	@Column (name = "description", columnDefinition = "longtext", nullable=false)
	private String description;
	
	@OneToMany(mappedBy = "buildingId", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementBuilding> settlementBuildingsIds = new ArrayList<>();

	protected Building() {
		super();
	}

	public Building(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SettlementBuilding> getSettlementBuildingsIds() {
		return settlementBuildingsIds;
	}

	@Override
	public String toString() {
		return "Building [name=" + name + ", description=" + description + ", settlementBuildingsIds="
				+ settlementBuildingsIds + "]";
	}

	public Long getId() {
		return id;
	}


}

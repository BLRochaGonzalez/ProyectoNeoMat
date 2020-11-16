package org.iesalixar.bluisrochag.neomat.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@Table(name = "research")
public class Research {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "researchid")
	private Long researchId;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;

	@Column(name = "description", columnDefinition = "longtext", nullable = false)
	private String description;
	
	@Column(name = "buildsrequired")
	private Map<String, Integer> buildsRequired = new HashMap<String, Integer>();
	
	@OneToMany(mappedBy = "research", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SettlementResearch> settlementResearchsIds = new ArrayList<>();

	public Research() {
		super();
	}

	public Research(String name, String description, Map<String, Integer> buildsRequired) {
		super();
		this.name = name;
		this.description = description;
		this.buildsRequired = buildsRequired;
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

	public Map<String, Integer> getBuildsRequired() {
		return buildsRequired;
	}

	public void setBuildsRequired(Map<String, Integer> buildsRequired) {
		this.buildsRequired = buildsRequired;
	}

}

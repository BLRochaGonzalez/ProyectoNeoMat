package org.iesalixar.bluisrochag.neomat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "research")
public class Research {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "researchid")
	private Long id;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;

	@Column(name = "description", columnDefinition = "longtext", nullable = false)
	private String description;
	
	@ElementCollection
	@CollectionTable(name = "researchbuildsrequired", joinColumns = @JoinColumn(name = "researchid"))
	@Column(name = "buildsrequired")
	private List<String> buildsRequired = new ArrayList<String>();
	
	@OneToMany(mappedBy = "researchId", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementResearch> settlementResearchsIds = new ArrayList<>();

	protected Research() {
		super();
	}

	public Research(String name, String description, List<String> buildsRequired) {
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

	public List<String> getBuildsRequired() {
		return buildsRequired;
	}

	public void setBuildsRequired(List<String> buildsRequired) {
		this.buildsRequired = buildsRequired;
	}

	public List<SettlementResearch> getSettlementResearchsIds() {
		return settlementResearchsIds;
	}

	@Override
	public String toString() {
		return "Research [name=" + name + ", description=" + description + ", buildsRequired=" + buildsRequired
				+ ", settlementResearchsIds=" + settlementResearchsIds + "]";
	}

	public Long getId() {
		return id;
	}

}

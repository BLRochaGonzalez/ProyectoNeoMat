package org.iesalixar.bluisrochag.neomat.model;

import java.time.LocalDate;
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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "planet")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "planetid")
	private Long id;
	
	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;
	
	@Column (name = "launchdate", nullable=false)
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private LocalDate launchDate;
	
	@Column(name = "numplayers", columnDefinition = "integer", nullable=false)
	private Integer numPlayers;
	
	@Column(name = "numSettlements", columnDefinition = "integer", nullable=false)
	private Integer numSettlements;
	
	@OneToMany(mappedBy = "planet", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<User> usersId = new ArrayList<>();

	public Planet() {
		super();
	}

	public Planet(String name, LocalDate localDate) {
		super();
		this.name = name;
		this.launchDate = localDate;
		this.numPlayers = 0;
		this.numSettlements = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}

	public Integer getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(Integer numPlayers) {
		this.numPlayers = numPlayers;
	}

	public Integer getNumSettlements() {
		return numSettlements;
	}

	public void setNumSettlements(Integer numSettlements) {
		this.numSettlements = numSettlements;
	}

	public List<User> getUsersId() {
		return usersId;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", launchDate=" + launchDate + ", numPlayers=" + numPlayers
				+ ", numSettlements=" + numSettlements + ", usersId=" + usersId + "]";
	}

	public Long getId() {
		return id;
	}

}

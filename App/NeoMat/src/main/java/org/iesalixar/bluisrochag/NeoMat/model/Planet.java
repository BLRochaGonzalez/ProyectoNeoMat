package org.iesalixar.bluisrochag.neomat.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "planet")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "planetid")
	private Long planetId;
	
	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;
	
	@Column (name = "launchdate", nullable=false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private Date launchDate;
	
	@Column(name = "numplayers", columnDefinition = "integer", nullable=false)
	private Integer numPlayers;
	
	@Column(name = "numSettlements", columnDefinition = "integer", nullable=false)
	private Integer numSettlements;

	public Planet() {
		super();
	}

	public Planet(String name, Date launchDate, Integer numPlayers, Integer numSettlements) {
		super();
		this.name = name;
		this.launchDate = launchDate;
		this.numPlayers = numPlayers;
		this.numSettlements = numSettlements;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
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

	
}

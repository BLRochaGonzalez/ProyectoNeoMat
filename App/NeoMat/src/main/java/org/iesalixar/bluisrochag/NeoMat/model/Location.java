package org.iesalixar.bluisrochag.neomat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "locationid")
	private Long locationId;

	@Column(name = "continent", columnDefinition = "integer", nullable = false)
	private Integer continent;

	@Column(name = "country", columnDefinition = "integer", nullable = false)
	private Integer country;

	@Column(name = "region", columnDefinition = "integer", nullable = false)
	private Integer region;

	@OneToOne
	@JoinColumn(name = "settlement", updatable = false, nullable = false)
	private Settlement settlement;

	public Location() {
		super();
	}

	public Location(Integer continent, Integer country, Integer region) {
		super();
		this.continent = continent;
		this.country = country;
		this.region = region;
	}

	public Integer getContinent() {
		return continent;
	}

	public void setContinent(Integer continent) {
		this.continent = continent;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public Integer getRegion() {
		return region;
	}

	public void setRegion(Integer region) {
		this.region = region;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}

	@Override
	public String toString() {
		return "Location [continent=" + continent + ", country=" + country + ", region=" + region + ", settlement="
				+ settlement + "]";
	}

}

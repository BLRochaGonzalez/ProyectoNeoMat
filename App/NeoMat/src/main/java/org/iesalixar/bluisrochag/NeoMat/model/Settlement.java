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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "settlement")
public class Settlement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "settlementid")
	private Long settlementId;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false)
	private String name;

	/*
	 * Estos datos siguientes se usarán para almacenar la cantidad de recursos en el
	 * asentamiento cuando el usuario se desconecte junto con el tiempo en
	 * milisegundos, para calcular la cantidad que tendrá cuando vuelva a
	 * reconectarse
	 */
	@Column(name = "wquantity", columnDefinition = "integer", nullable = false)
	private Integer wQuantity;

	@Column(name = "gquantity", columnDefinition = "integer", nullable = false)
	private Integer gQuantity;

	@Column(name = "cquantity", columnDefinition = "integer", nullable = false)
	private Integer cQuantity;

	@Column(name = "squantity", columnDefinition = "integer", nullable = false)
	private Integer sQuantity;

	@Column(name = "rquantity", columnDefinition = "integer", nullable = false)
	private Integer rQuantity;

	@Column(name = "equantity", columnDefinition = "integer", nullable = false)
	private Integer eQuantity;
	
	//tiempo de ejemplo para sobrescribir luego con el real
	@Column(name = "lastconnection", columnDefinition = "bigint")
    private Long lastConnection;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user")
	private User user;
	
	@OneToOne(mappedBy = "settlement", cascade = CascadeType.ALL)
    private Location location;
	
	@OneToMany(mappedBy = "settlementIds", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SettlementTroup> settlementTroupsIds = new ArrayList<>();
	
	@OneToMany(mappedBy = "buildingIds", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SettlementBuilding> settlementBuildingsIds = new ArrayList<>();
	
	@OneToMany(mappedBy = "settlementIds", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SettlementResearch> settlementResearchsIds = new ArrayList<>();
	
	public Settlement() {
		super();
	}

	public Settlement(String name) {
		super();
		this.name = name;
		this.wQuantity = 50;
		this.gQuantity = 50;
		this.cQuantity = 50;
		this.sQuantity = 50;
		this.rQuantity = 0;
		this.eQuantity = 0;
		this.lastConnection = 0L;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getwQuantity() {
		return wQuantity;
	}

	public void setwQuantity(Integer wQuantity) {
		this.wQuantity = wQuantity;
	}

	public Integer getgQuantity() {
		return gQuantity;
	}

	public void setgQuantity(Integer gQuantity) {
		this.gQuantity = gQuantity;
	}

	public Integer getcQuantity() {
		return cQuantity;
	}

	public void setcQuantity(Integer cQuantity) {
		this.cQuantity = cQuantity;
	}

	public Integer getsQuantity() {
		return sQuantity;
	}

	public void setsQuantity(Integer sQuantity) {
		this.sQuantity = sQuantity;
	}

	public Integer getrQuantity() {
		return rQuantity;
	}

	public void setrQuantity(Integer rQuantity) {
		this.rQuantity = rQuantity;
	}

	public Integer geteQuantity() {
		return eQuantity;
	}

	public void seteQuantity(Integer eQuantity) {
		this.eQuantity = eQuantity;
	}

	public Long getLastConnection() {
		return lastConnection;
	}

	public void setLastConnection(Long lastConnection) {
		this.lastConnection = lastConnection;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setSettlementTroupsIds(List<SettlementTroup> settlementTroupsIds) {
		this.settlementTroupsIds = settlementTroupsIds;
	}

	public void setSettlementBuildingsIds(List<SettlementBuilding> settlementBuildingsIds) {
		this.settlementBuildingsIds = settlementBuildingsIds;
	}

	public void setSettlementResearchsIds(List<SettlementResearch> settlementResearchsIds) {
		this.settlementResearchsIds = settlementResearchsIds;
	}

	@Override
	public String toString() {
		return "Settlement [name=" + name + ", wQuantity=" + wQuantity + ", gQuantity=" + gQuantity + ", cQuantity="
				+ cQuantity + ", sQuantity=" + sQuantity + ", rQuantity=" + rQuantity + ", eQuantity=" + eQuantity
				+ ", lastConnection=" + lastConnection + ", user=" + user + ", location=" + location
				+ ", settlementTroupsIds=" + settlementTroupsIds + ", settlementBuildingsIds=" + settlementBuildingsIds
				+ ", settlementResearchsIds=" + settlementResearchsIds + "]";
	}

	
	
}

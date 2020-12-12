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
	private Long id;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false)
	private String name;

	/*
	 * Estos datos siguientes se usarán para almacenar la cantidad de recursos en el
	 * asentamiento cuando el usuario se desconecte junto con el tiempo en
	 * milisegundos, para calcular la cantidad que tendrá cuando vuelva a
	 * reconectarse
	 */
	@Column(name = "wquantity", columnDefinition = "double", nullable = false)
	private Double wQuantity;

	@Column(name = "gquantity", columnDefinition = "double", nullable = false)
	private Double gQuantity;

	@Column(name = "cquantity", columnDefinition = "double", nullable = false)
	private Double cQuantity;

	@Column(name = "squantity", columnDefinition = "double", nullable = false)
	private Double sQuantity;

	@Column(name = "rquantity", columnDefinition = "double", nullable = false)
	private Double rQuantity;

	@Column(name = "equantity", columnDefinition = "double", nullable = false)
	private Double eQuantity;
	
	//tiempo de ejemplo para sobrescribir luego con el real
	@Column(name = "lastconnection", columnDefinition = "bigint")
    private Long lastConnection;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user")
	private User user;
	
	@OneToOne(mappedBy = "settlement", cascade = CascadeType.PERSIST)
    private Location location;
	
	@OneToMany(mappedBy = "settlementId", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementTroup> settlementTroupsId = new ArrayList<>();
	
	@OneToMany(mappedBy = "buildingId", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementBuilding> settlementBuildingsId = new ArrayList<>();
	
	@OneToMany(mappedBy = "settlementId", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementResearch> settlementResearchsId = new ArrayList<>();
	
	public Settlement() {
		super();
	}

	public Settlement(String name) {
		super();
		this.name = name;
		this.wQuantity = 100.0;
		this.gQuantity = 100.0;
		this.cQuantity = 100.0;
		this.sQuantity = 100.0;
		this.rQuantity = 0.0;
		this.eQuantity = 0.0;
		this.lastConnection = 0L;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getwQuantity() {
		return wQuantity;
	}

	public void setwQuantity(Double d) {
		this.wQuantity = d;
	}

	public Double getgQuantity() {
		return gQuantity;
	}

	public void setgQuantity(Double gQuantity) {
		this.gQuantity = gQuantity;
	}

	public Double getcQuantity() {
		return cQuantity;
	}

	public void setcQuantity(Double cQuantity) {
		this.cQuantity = cQuantity;
	}

	public Double getsQuantity() {
		return sQuantity;
	}

	public void setsQuantity(Double sQuantity) {
		this.sQuantity = sQuantity;
	}

	public Double getrQuantity() {
		return rQuantity;
	}

	public void setrQuantity(Double rQuantity) {
		this.rQuantity = rQuantity;
	}

	public Double geteQuantity() {
		return eQuantity;
	}

	public void seteQuantity(Double eQuantity) {
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
		this.settlementTroupsId = settlementTroupsIds;
	}

	public void setSettlementBuildingsIds(List<SettlementBuilding> settlementBuildingsIds) {
		this.settlementBuildingsId = settlementBuildingsIds;
	}

	public void setSettlementResearchsIds(List<SettlementResearch> settlementResearchsIds) {
		this.settlementResearchsId = settlementResearchsIds;
	}

	@Override
	public String toString() {
		return "Settlement [name=" + name + ", wQuantity=" + wQuantity + ", gQuantity=" + gQuantity + ", cQuantity="
				+ cQuantity + ", sQuantity=" + sQuantity + ", rQuantity=" + rQuantity + ", eQuantity=" + eQuantity
				+ ", lastConnection=" + lastConnection + ", user=" + user + ", location=" + location
				+ ", settlementTroupsIds=" + settlementTroupsId + ", settlementBuildingsIds=" + settlementBuildingsId
				+ ", settlementResearchsIds=" + settlementResearchsId + "]";
	}

	public Long getId() {
		return id;
	}

	public List<SettlementTroup> getSettlementTroupsIds() {
		return settlementTroupsId;
	}

	public List<SettlementBuilding> getSettlementBuildingsIds() {
		return settlementBuildingsId;
	}

	public List<SettlementResearch> getSettlementResearchsIds() {
		return settlementResearchsId;
	}

	
	
}

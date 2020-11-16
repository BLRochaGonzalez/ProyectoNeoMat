package org.iesalixar.bluisrochag.neomat.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "settlementbuilding")
public class SettlementBuilding {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "settlementbuildingid")
	private Long settlementBuildingId;
	
	@Column (name = "buildlevel", columnDefinition = "integer")
	private Integer buildLevel;
	
	@Column (name = "reqequantity", columnDefinition = "integer")
	private Integer reqEQuantity;
	
	@Column (name = "reqwquantity", columnDefinition = "integer", nullable=false)
	private Integer reqWQuantity;
	
	@Column (name = "reqgquantity", columnDefinition = "integer", nullable=false)
	private Integer reqGQuantity;
	
	@Column (name = "reqcquantity", columnDefinition = "integer", nullable=false)
	private Integer reqCQuantity;
	
	@Column (name = "reqSquantity", columnDefinition = "integer", nullable=false)
	private Integer reqSQuantity;
	
	@Column (name = "reqrquantity", columnDefinition = "integer")
	private Integer reqRadQuantity;
	
	@Column (name = "buildtime", columnDefinition = "integer", nullable=false)
	private Integer buildTime;
	
	@Column (name = "resourcequantity", columnDefinition = "integer", nullable=false)
	private Integer resourceQuantity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "settlement")
	private Settlement settlementId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "building")
	private Building buildingId;

	public SettlementBuilding() {
		super();
	}

	public SettlementBuilding(Integer buildLevel, Integer reqEQuantity, Integer reqWQuantity, Integer reqGQuantity,
			Integer reqCQuantity, Integer reqSQuantity, Integer reqRadQuantity, Integer buildTime,
			Integer resourceQuantity) {
		super();
		this.buildLevel = 1;
		this.reqEQuantity = reqEQuantity;
		this.reqWQuantity = reqWQuantity;
		this.reqGQuantity = reqGQuantity;
		this.reqCQuantity = reqCQuantity;
		this.reqSQuantity = reqSQuantity;
		this.reqRadQuantity = reqRadQuantity;
		this.buildTime = buildTime;
		this.resourceQuantity = resourceQuantity;
	}

	public Long getSettlementBuildingId() {
		return settlementBuildingId;
	}

	public void setSettlementBuildingId(Long settlementBuildingId) {
		this.settlementBuildingId = settlementBuildingId;
	}

	public Settlement getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Settlement settlementId) {
		this.settlementId = settlementId;
	}

	public Building getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Building buildingId) {
		this.buildingId = buildingId;
	}
}

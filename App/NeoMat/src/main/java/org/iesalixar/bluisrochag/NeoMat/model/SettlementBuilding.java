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
	private Long id;
	
	@Column (name = "buildlevel", columnDefinition = "integer")
	private Integer buildLevel;
	
	@Column (name = "reqequantity", columnDefinition = "double")
	private Double reqEQuantity;
	
	@Column (name = "reqwquantity", columnDefinition = "double", nullable=false)
	private Double reqWQuantity;
	
	@Column (name = "reqgquantity", columnDefinition = "double", nullable=false)
	private Double reqGQuantity;
	
	@Column (name = "reqcquantity", columnDefinition = "double", nullable=false)
	private Double reqCQuantity;
	
	@Column (name = "reqsquantity", columnDefinition = "double", nullable=false)
	private Double reqSQuantity;
	
	@Column (name = "reqrquantity", columnDefinition = "double")
	private Double reqRadQuantity;
	
	@Column (name = "buildtime", columnDefinition = "integer", nullable=false)
	private Integer buildTime;
	
	@Column (name = "resourcequantity", columnDefinition = "double", nullable=false)
	private Double resourceQuantity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "settlement")
	private Settlement settlementId;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "building")
	private Building buildingId;

	public SettlementBuilding() {
		super();
	}

	public SettlementBuilding(Double reqEQuantity, Double reqWQuantity, Double reqGQuantity,
			Double reqCQuantity, Double reqSQuantity, Double reqRadQuantity, Integer buildTime,
			Double resourceQuantity) {
		super();
		this.buildLevel = 0;
		this.reqEQuantity = reqEQuantity;
		this.reqWQuantity = reqWQuantity;
		this.reqGQuantity = reqGQuantity;
		this.reqCQuantity = reqCQuantity;
		this.reqSQuantity = reqSQuantity;
		this.reqRadQuantity = reqRadQuantity;
		this.buildTime = buildTime;
		this.resourceQuantity = resourceQuantity;
	}

	public Integer getBuildLevel() {
		return buildLevel;
	}

	public void setBuildLevel(Integer buildLevel) {
		this.buildLevel = buildLevel;
	}

	public Double getReqEQuantity() {
		return reqEQuantity;
	}

	public void setReqEQuantity(Double reqEQuantity) {
		this.reqEQuantity = reqEQuantity;
	}

	public Double getReqWQuantity() {
		return reqWQuantity;
	}

	public void setReqWQuantity(Double reqWQuantity) {
		this.reqWQuantity = reqWQuantity;
	}

	public Double getReqGQuantity() {
		return reqGQuantity;
	}

	public void setReqGQuantity(Double reqGQuantity) {
		this.reqGQuantity = reqGQuantity;
	}

	public Double getReqCQuantity() {
		return reqCQuantity;
	}

	public void setReqCQuantity(Double reqCQuantity) {
		this.reqCQuantity = reqCQuantity;
	}

	public Double getReqSQuantity() {
		return reqSQuantity;
	}

	public void setReqSQuantity(Double reqSQuantity) {
		this.reqSQuantity = reqSQuantity;
	}

	public Double getReqRadQuantity() {
		return reqRadQuantity;
	}

	public void setReqRadQuantity(Double reqRadQuantity) {
		this.reqRadQuantity = reqRadQuantity;
	}

	public Integer getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(Integer buildTime) {
		this.buildTime = buildTime;
	}

	public Double getResourceQuantity() {
		return resourceQuantity;
	}

	public void setResourceQuantity(Double resourceQuantity) {
		this.resourceQuantity = resourceQuantity;
	}

	public Settlement getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Settlement settlementId) {
		this.settlementId = settlementId;
	}

	public Building getBuildingIds() {
		return buildingId;
	}

	public void setBuildingIds(Building buildingIds) {
		this.buildingId = buildingIds;
	}

	@Override
	public String toString() {
		return "SettlementBuilding [buildLevel=" + buildLevel + ", reqEQuantity=" + reqEQuantity + ", reqWQuantity="
				+ reqWQuantity + ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity="
				+ reqSQuantity + ", reqRadQuantity=" + reqRadQuantity + ", buildTime=" + buildTime
				+ ", resourceQuantity=" + resourceQuantity + ", settlementId=" + settlementId + ", buildingIds="
				+ buildingId + "]";
	}

	public Long getId() {
		return id;
	}

	
}

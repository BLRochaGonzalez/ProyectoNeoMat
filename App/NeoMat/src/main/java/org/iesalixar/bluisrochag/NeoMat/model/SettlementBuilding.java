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
	
	@Column (name = "reqsquantity", columnDefinition = "integer", nullable=false)
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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "building")
	private Building buildingIds;

	protected SettlementBuilding() {
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

	public Integer getBuildLevel() {
		return buildLevel;
	}

	public void setBuildLevel(Integer buildLevel) {
		this.buildLevel = buildLevel;
	}

	public Integer getReqEQuantity() {
		return reqEQuantity;
	}

	public void setReqEQuantity(Integer reqEQuantity) {
		this.reqEQuantity = reqEQuantity;
	}

	public Integer getReqWQuantity() {
		return reqWQuantity;
	}

	public void setReqWQuantity(Integer reqWQuantity) {
		this.reqWQuantity = reqWQuantity;
	}

	public Integer getReqGQuantity() {
		return reqGQuantity;
	}

	public void setReqGQuantity(Integer reqGQuantity) {
		this.reqGQuantity = reqGQuantity;
	}

	public Integer getReqCQuantity() {
		return reqCQuantity;
	}

	public void setReqCQuantity(Integer reqCQuantity) {
		this.reqCQuantity = reqCQuantity;
	}

	public Integer getReqSQuantity() {
		return reqSQuantity;
	}

	public void setReqSQuantity(Integer reqSQuantity) {
		this.reqSQuantity = reqSQuantity;
	}

	public Integer getReqRadQuantity() {
		return reqRadQuantity;
	}

	public void setReqRadQuantity(Integer reqRadQuantity) {
		this.reqRadQuantity = reqRadQuantity;
	}

	public Integer getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(Integer buildTime) {
		this.buildTime = buildTime;
	}

	public Integer getResourceQuantity() {
		return resourceQuantity;
	}

	public void setResourceQuantity(Integer resourceQuantity) {
		this.resourceQuantity = resourceQuantity;
	}

	public Settlement getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Settlement settlementId) {
		this.settlementId = settlementId;
	}

	public Building getBuildingIds() {
		return buildingIds;
	}

	public void setBuildingIds(Building buildingIds) {
		this.buildingIds = buildingIds;
	}

	@Override
	public String toString() {
		return "SettlementBuilding [buildLevel=" + buildLevel + ", reqEQuantity=" + reqEQuantity + ", reqWQuantity="
				+ reqWQuantity + ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity="
				+ reqSQuantity + ", reqRadQuantity=" + reqRadQuantity + ", buildTime=" + buildTime
				+ ", resourceQuantity=" + resourceQuantity + ", settlementId=" + settlementId + ", buildingIds="
				+ buildingIds + "]";
	}

	
}

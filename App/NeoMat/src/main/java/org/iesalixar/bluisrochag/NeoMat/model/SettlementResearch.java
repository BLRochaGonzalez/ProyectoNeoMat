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
@Table(name = "settlementresearch")
public class SettlementResearch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "settlementresearchid")
	private Long id;
	
	@Column (name = "researchlevel", columnDefinition = "integer")
	private Integer researchLevel;

	@Column(name = "reqwquantity", columnDefinition = "double", nullable = false)
	private Double reqWQuantity;

	@Column(name = "reqgquantity", columnDefinition = "double", nullable = false)
	private Double reqGQuantity;

	@Column(name = "reqcquantity", columnDefinition = "double", nullable = false)
	private Double reqCQuantity;

	@Column(name = "reqsquantity", columnDefinition = "double", nullable = false)
	private Double reqSQuantity;

	@Column(name = "reqrquantity", columnDefinition = "double")
	private Double reqRadQuantity;

	@Column(name = "researchtime", columnDefinition = "integer", nullable = false)
	private Integer researchTime;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "settlement")
	private Settlement settlementId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "research")
	private Research researchId;

	protected SettlementResearch() {
		super();
	}

	public SettlementResearch(Integer researchLevel, Double reqWQuantity, Double reqGQuantity, Double reqCQuantity,
			Double reqSQuantity, Double reqRadQuantity, Integer researchTime) {
		super();
		this.researchLevel = researchLevel;
		this.reqWQuantity = reqWQuantity;
		this.reqGQuantity = reqGQuantity;
		this.reqCQuantity = reqCQuantity;
		this.reqSQuantity = reqSQuantity;
		this.reqRadQuantity = reqRadQuantity;
		this.researchTime = researchTime;
	}

	public Integer getResearchLevel() {
		return researchLevel;
	}

	public void setResearchLevel(Integer researchLevel) {
		this.researchLevel = researchLevel;
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

	public Integer getResearchTime() {
		return researchTime;
	}

	public void setResearchTime(Integer researchTime) {
		this.researchTime = researchTime;
	}

	public Settlement getSettlementIds() {
		return settlementId;
	}

	public void setSettlementIds(Settlement settlementIds) {
		this.settlementId = settlementIds;
	}

	public Research getResearchIds() {
		return researchId;
	}

	public void setResearchIds(Research researchIds) {
		this.researchId = researchIds;
	}

	@Override
	public String toString() {
		return "SettlementResearch [researchLevel=" + researchLevel + ", reqWQuantity=" + reqWQuantity
				+ ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity=" + reqSQuantity
				+ ", reqRadQuantity=" + reqRadQuantity + ", researchTime=" + researchTime + ", settlementIds="
				+ settlementId + ", researchIds=" + researchId + "]";
	}

	public Long getId() {
		return id;
	}

}

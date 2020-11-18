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
	private Long settlementResearchId;
	
	@Column (name = "researchlevel", columnDefinition = "integer")
	private Integer researchLevel;

	@Column(name = "reqwquantity", columnDefinition = "integer", nullable = false)
	private Integer reqWQuantity;

	@Column(name = "reqgquantity", columnDefinition = "integer", nullable = false)
	private Integer reqGQuantity;

	@Column(name = "reqcquantity", columnDefinition = "integer", nullable = false)
	private Integer reqCQuantity;

	@Column(name = "reqsquantity", columnDefinition = "integer", nullable = false)
	private Integer reqSQuantity;

	@Column(name = "reqrquantity", columnDefinition = "integer")
	private Integer reqRadQuantity;

	@Column(name = "researchtime", columnDefinition = "integer", nullable = false)
	private Integer researchTime;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "settlement")
	private Settlement settlementIds;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "research")
	private Research researchIds;

	protected SettlementResearch() {
		super();
	}

	public SettlementResearch(Integer researchLevel, Integer reqWQuantity, Integer reqGQuantity, Integer reqCQuantity,
			Integer reqSQuantity, Integer reqRadQuantity, Integer researchTime) {
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

	public Integer getResearchTime() {
		return researchTime;
	}

	public void setResearchTime(Integer researchTime) {
		this.researchTime = researchTime;
	}

	public Settlement getSettlementIds() {
		return settlementIds;
	}

	public void setSettlementIds(Settlement settlementIds) {
		this.settlementIds = settlementIds;
	}

	public Research getResearchIds() {
		return researchIds;
	}

	public void setResearchIds(Research researchIds) {
		this.researchIds = researchIds;
	}

	@Override
	public String toString() {
		return "SettlementResearch [researchLevel=" + researchLevel + ", reqWQuantity=" + reqWQuantity
				+ ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity=" + reqSQuantity
				+ ", reqRadQuantity=" + reqRadQuantity + ", researchTime=" + researchTime + ", settlementIds="
				+ settlementIds + ", researchIds=" + researchIds + "]";
	}

}

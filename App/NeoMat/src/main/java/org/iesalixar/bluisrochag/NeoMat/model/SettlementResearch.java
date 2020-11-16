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

	@Column(name = "reqSquantity", columnDefinition = "integer", nullable = false)
	private Integer reqSQuantity;

	@Column(name = "reqrquantity", columnDefinition = "integer")
	private Integer reqRadQuantity;

	@Column(name = "researchtime", columnDefinition = "integer", nullable = false)
	private Integer researchTime;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "settlement")
	private Settlement settlementId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "research")
	private Research researchId;

	public SettlementResearch() {
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

	public Long getSettlementResearchId() {
		return settlementResearchId;
	}

	public void setSettlementResearchId(Long settlementResearchId) {
		this.settlementResearchId = settlementResearchId;
	}

	public Settlement getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Settlement settlementId) {
		this.settlementId = settlementId;
	}

	public Research getResearchId() {
		return researchId;
	}

	public void setResearchId(Research researchId) {
		this.researchId = researchId;
	}
}

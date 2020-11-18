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
@Table(name = "settlementtroup")
public class SettlementTroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "settlementtroupid")
	private Long settlementTroupId;

	@Column(name = "quantity", columnDefinition = "integer")
	private Integer quantity;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "settlement")
	private Settlement settlementIds;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "troup")
	private Troup troupIds;

	public SettlementTroup() {
		super();
		this.quantity = 0;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Settlement getSettlementIds() {
		return settlementIds;
	}

	public void setSettlementIds(Settlement settlementIds) {
		this.settlementIds = settlementIds;
	}

	public Troup getTroupIds() {
		return troupIds;
	}

	public void setTroupIds(Troup troupIds) {
		this.troupIds = troupIds;
	}

	@Override
	public String toString() {
		return "SettlementTroup [quantity=" + quantity + ", settlementIds=" + settlementIds + ", troupIds=" + troupIds
				+ "]";
	}

	
}

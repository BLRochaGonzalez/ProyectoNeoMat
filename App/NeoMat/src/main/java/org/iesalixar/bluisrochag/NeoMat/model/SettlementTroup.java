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
	private Long id;

	@Column(name = "quantity", columnDefinition = "integer")
	private Integer quantity;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "settlement")
	private Settlement settlementId;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "troup")
	private Troup troupId;

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
		return settlementId;
	}

	public void setSettlementIds(Settlement settlementIds) {
		this.settlementId = settlementIds;
	}

	public Troup getTroupIds() {
		return troupId;
	}

	public void setTroupIds(Troup troupIds) {
		this.troupId = troupIds;
	}

	@Override
	public String toString() {
		return "SettlementTroup [quantity=" + quantity + ", settlementIds=" + settlementId + ", troupIds=" + troupId
				+ "]";
	}

	public Long getId() {
		return id;
	}

	
}

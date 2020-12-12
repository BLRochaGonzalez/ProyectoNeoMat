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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "troup")
public class Troup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "troupid")
	private Long id;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;

	@Column(name = "description", columnDefinition = "longtext", nullable = false)
	private String description;

	@Column(name = "isdef", columnDefinition = "boolean", nullable = false)
	private Boolean isDef;

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

	@Column(name = "createtime", columnDefinition = "integer")
	private Integer createTime;
	
	@Column(name = "damage", columnDefinition = "double")
	private Double damage;
	
	@Column(name = "life", columnDefinition = "double")
	private Double life;
	
	@Column(name = "shield", columnDefinition = "double")
	private Double shield;

	@OneToMany(mappedBy = "troupId", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementTroup> settlementTroupsId = new ArrayList<>();

	protected Troup() {
		super();
	}

	public Troup(String name, String description, Boolean isDef, Double reqWQuantity, Double reqGQuantity,
			Double reqCQuantity, Double reqSQuantity, Double reqRadQuantity, Integer createTime, Double damage, Double shield, Double life) {
		super();
		this.name = name;
		this.description = description;
		this.isDef = isDef;
		this.reqWQuantity = reqWQuantity;
		this.reqGQuantity = reqGQuantity;
		this.reqCQuantity = reqCQuantity;
		this.reqSQuantity = reqSQuantity;
		this.reqRadQuantity = reqRadQuantity;
		this.createTime = createTime;
		this.damage = damage;
		this.shield = shield;
		this.life = life;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsDef() {
		return isDef;
	}

	public void setIsDef(Boolean isDef) {
		this.isDef = isDef;
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

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public List<SettlementTroup> getSettlementTroupsIds() {
		return settlementTroupsId;
	}

	public void setSettlementTroupsIds(List<SettlementTroup> settlementTroupsIds) {
		this.settlementTroupsId = settlementTroupsIds;
	}

	public Double getDamage() {
		return damage;
	}

	public void setDamage(Double damage) {
		this.damage = damage;
	}

	public Double getLife() {
		return life;
	}

	public void setLife(Double life) {
		this.life = life;
	}

	public Double getShield() {
		return shield;
	}

	public void setShield(Double shield) {
		this.shield = shield;
	}

	public List<SettlementTroup> getSettlementTroupsId() {
		return settlementTroupsId;
	}

	public void setSettlementTroupsId(List<SettlementTroup> settlementTroupsId) {
		this.settlementTroupsId = settlementTroupsId;
	}

	@Override
	public String toString() {
		return "Troup [name=" + name + ", description=" + description + ", isDef=" + isDef + ", reqWQuantity="
				+ reqWQuantity + ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity="
				+ reqSQuantity + ", reqRadQuantity=" + reqRadQuantity + ", createTime=" + createTime + ", damage="
				+ damage + ", life=" + life + ", shield=" + shield + ", settlementTroupsId=" + settlementTroupsId + "]";
	}


}

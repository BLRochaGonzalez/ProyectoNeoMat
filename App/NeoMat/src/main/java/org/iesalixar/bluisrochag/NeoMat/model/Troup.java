package org.iesalixar.bluisrochag.neomat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	@Column(name = "reqsquantity", columnDefinition = "double", nullable=false)
	private Double reqSQuantity;

	@Column(name = "reqrquantity", columnDefinition = "double")
	private Double reqRadQuantity;
	
	@Column(name = "createtime", columnDefinition = "integer")
	private Integer createTime;
	
	@ElementCollection
	@CollectionTable(name = "researchtroupsrequired", joinColumns = @JoinColumn(name = "troupid"))
	@Column(name = "researchsrequired")
	private List<String> researchsRequired = new ArrayList<String>();
	
	@ElementCollection
	@CollectionTable(name = "buildstroupsrequired", joinColumns = @JoinColumn(name = "troupid"))
	@Column(name = "buildsrequired")
	private List<String> buildsRequired = new ArrayList<String>();
	
	@OneToMany(mappedBy = "troupId", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<SettlementTroup> settlementTroupsId = new ArrayList<>();

	protected Troup() {
		super();
	}

	public Troup(String name, String description, Boolean isDef, Double reqWQuantity,
			Double reqGQuantity, Double reqCQuantity, Double reqSQuantity, Double reqRadQuantity,
			Integer createTime, List<String> researchsRequired, List<String> buildsRequired) {
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
		this.researchsRequired = researchsRequired;
		this.buildsRequired = buildsRequired;
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

	public List<String> getResearchsRequired() {
		return researchsRequired;
	}

	public void setResearchsRequired(List<String> researchsRequired) {
		this.researchsRequired = researchsRequired;
	}

	public List<String> getBuildsRequired() {
		return buildsRequired;
	}

	public void setBuildsRequired(List<String> buildsRequired) {
		this.buildsRequired = buildsRequired;
	}

	public List<SettlementTroup> getSettlementTroupsIds() {
		return settlementTroupsId;
	}

	public void setSettlementTroupsIds(List<SettlementTroup> settlementTroupsIds) {
		this.settlementTroupsId = settlementTroupsIds;
	}

	@Override
	public String toString() {
		return "Troup [name=" + name + ", description=" + description + ", isDef=" + isDef + ", reqWQuantity="
				+ reqWQuantity + ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity="
				+ reqSQuantity + ", reqRadQuantity=" + reqRadQuantity + ", createTime=" + createTime
				+ ", researchsRequired=" + researchsRequired + ", buildsRequired=" + buildsRequired
				+ ", settlementTroupsIds=" + settlementTroupsId + "]";
	}


	
}

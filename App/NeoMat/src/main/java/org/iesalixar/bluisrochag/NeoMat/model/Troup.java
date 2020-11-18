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
	private Long troupId;
	
	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;

	@Column(name = "description", columnDefinition = "longtext", nullable = false)
	private String description;
	
	@Column(name = "isdef", columnDefinition = "boolean", nullable = false)
	private Boolean isDef;
	
	@Column(name = "reqwquantity", columnDefinition = "integer", nullable = false)
	private Integer reqWQuantity;

	@Column(name = "reqgquantity", columnDefinition = "integer", nullable = false)
	private Integer reqGQuantity;

	@Column(name = "reqcquantity", columnDefinition = "integer", nullable = false)
	private Integer reqCQuantity;

	@Column(name = "reqsquantity", columnDefinition = "integer", nullable=false)
	private Integer reqSQuantity;

	@Column(name = "reqrquantity", columnDefinition = "integer")
	private Integer reqRadQuantity;
	
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
	
	@OneToMany(mappedBy = "troupIds", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SettlementTroup> settlementTroupsIds = new ArrayList<>();

	protected Troup() {
		super();
	}

	public Troup(String name, String description, Boolean isDef, Integer reqWQuantity,
			Integer reqGQuantity, Integer reqCQuantity, Integer reqSQuantity, Integer reqRadQuantity,
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
		return settlementTroupsIds;
	}

	public void setSettlementTroupsIds(List<SettlementTroup> settlementTroupsIds) {
		this.settlementTroupsIds = settlementTroupsIds;
	}

	@Override
	public String toString() {
		return "Troup [name=" + name + ", description=" + description + ", isDef=" + isDef + ", reqWQuantity="
				+ reqWQuantity + ", reqGQuantity=" + reqGQuantity + ", reqCQuantity=" + reqCQuantity + ", reqSQuantity="
				+ reqSQuantity + ", reqRadQuantity=" + reqRadQuantity + ", createTime=" + createTime
				+ ", researchsRequired=" + researchsRequired + ", buildsRequired=" + buildsRequired
				+ ", settlementTroupsIds=" + settlementTroupsIds + "]";
	}

	
}

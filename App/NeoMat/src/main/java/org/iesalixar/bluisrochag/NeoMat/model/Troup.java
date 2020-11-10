package org.iesalixar.bluisrochag.neomat.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "quantity", columnDefinition = "integer")
	private Integer quantity;
	
	@Column(name = "isdef", columnDefinition = "boolean", nullable = false)
	private Boolean isDef;
	
	@Column(name = "reqwquantity", columnDefinition = "integer", nullable = false)
	private Integer reqWQuantity;

	@Column(name = "reqgquantity", columnDefinition = "integer", nullable = false)
	private Integer reqGQuantity;

	@Column(name = "reqcquantity", columnDefinition = "integer", nullable = false)
	private Integer reqCQuantity;

	@Column(name = "reqSquantity", columnDefinition = "integer", nullable=false)
	private Integer reqSQuantity;

	@Column(name = "reqrquantity", columnDefinition = "integer")
	private Integer reqRadQuantity;
	
	@Column(name = "createtime", columnDefinition = "integer")
	private Integer createTime;
	
	@Column(name = "researchsrequired")
	private Map<String, Integer> researchsRequired = new HashMap<String, Integer>();
	
	@Column(name = "buildsrequired")
	private Map<String, Integer> buildsRequired = new HashMap<String, Integer>();

	public Troup() {
		super();
	}

	public Troup(String name, String description, Integer quantity, Boolean isDef, Integer reqWQuantity,
			Integer reqGQuantity, Integer reqCQuantity, Integer reqSQuantity, Integer reqRadQuantity,
			Integer createTime, Map<String, Integer> researchsRequired, Map<String, Integer> buildsRequired) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public Map<String, Integer> getResearchsRequired() {
		return researchsRequired;
	}

	public void setResearchsRequired(Map<String, Integer> researchsRequired) {
		this.researchsRequired = researchsRequired;
	}

	public Map<String, Integer> getBuildsRequired() {
		return buildsRequired;
	}

	public void setBuildsRequired(Map<String, Integer> buildsRequired) {
		this.buildsRequired = buildsRequired;
	}
}

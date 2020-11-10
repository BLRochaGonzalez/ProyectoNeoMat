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
@Table(name = "research")
public class Research {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "researchid")
	private Long researchId;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;

	@Column(name = "description", columnDefinition = "longtext", nullable = false)
	private String description;
	
	@Column(name = "isbuilt", columnDefinition = "boolean default false")
	private Boolean isBuilt;
	
	@Column (name = "buildlevel", columnDefinition = "integer")
	private Integer buildLevel;

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

	@Column(name = "buildsrequired")
	private Map<String, Integer> buildsRequired = new HashMap<String, Integer>();

	public Research() {
		super();
	}

	public Research(String name, String description, Boolean isBuilt, Integer buildLevel, Integer reqWQuantity,
			Integer reqGQuantity, Integer reqCQuantity, Integer reqSQuantity, Integer reqRadQuantity,
			Integer researchTime, Map<String, Integer> buildsRequired) {
		super();
		this.name = name;
		this.description = description;
		this.isBuilt = isBuilt;
		this.buildLevel = buildLevel;
		this.reqWQuantity = reqWQuantity;
		this.reqGQuantity = reqGQuantity;
		this.reqCQuantity = reqCQuantity;
		this.reqSQuantity = reqSQuantity;
		this.reqRadQuantity = reqRadQuantity;
		this.researchTime = researchTime;
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

	public Boolean getIsBuilt() {
		return isBuilt;
	}

	public void setIsBuilt(Boolean isBuilt) {
		this.isBuilt = isBuilt;
	}

	public Integer getBuildLevel() {
		return buildLevel;
	}

	public void setBuildLevel(Integer buildLevel) {
		this.buildLevel = buildLevel;
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

	public Map<String, Integer> getBuildsRequired() {
		return buildsRequired;
	}

	public void setBuildsRequired(Map<String, Integer> buildsRequired) {
		this.buildsRequired = buildsRequired;
	}

}

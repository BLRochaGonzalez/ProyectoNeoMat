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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private Long id;
	
	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false)
	private String name;
	
	@Column(name = "nick", columnDefinition = "varchar(45)", unique = true)
	private String nick;
	
	@Column(name = "email", columnDefinition = "varchar(80)", nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", columnDefinition = "varchar(18)")
	private String password;
	
	@Column(name = "phone", columnDefinition = "varchar(30)")
	private String phone;
	
//	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    @JoinTable(name = "roleusers", joinColumns = @JoinColumn(name = "usuarioId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
//    private Set<Role> role;
	@Column(name = "role", columnDefinition = "varchar(30)")
	private String role;
	
	@Column(name="points", columnDefinition = "double", nullable=false)
	private Double points;
	
	@Column(name="tpoints", columnDefinition = "double", nullable=false)
	private Double troupPoints;
	
	@Column(name="bpoints", columnDefinition = "double", nullable=false)
	private Double buildingPoints;
	
	@Column(name="rpoints", columnDefinition = "double", nullable=false)
	private Double researchPoints;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "planet")
	private Planet planet;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<Settlement> settlementsId = new ArrayList<>();

	public User() {
		super();
	}

	public User(String name, String nick, String email, String password, String phone, String role) {
		super();
		this.name = name;
		this.nick = nick;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.role = role;
		this.points = 0.0;
		this.buildingPoints = 0.0;
		this.researchPoints = 0.0;
		this.troupPoints = 0.0;
	}

	public Long getId() {
		return id;
	}
	
	public Double getTroupPoints() {
		return troupPoints;
	}

	public void setTroupPoints(Double troupPoints) {
		this.troupPoints = troupPoints;
	}

	public Double getBuildingPoints() {
		return buildingPoints;
	}

	public void setBuildingPoints(Double buildingPoints) {
		this.buildingPoints = buildingPoints;
	}

	public Double getResearchPoints() {
		return researchPoints;
	}

	public void setResearchPoints(Double researchPoints) {
		this.researchPoints = researchPoints;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public Set<Role> getRole() {
//		return role;
//	}
//
//	public void setRole(Set<Role> role) {
//		this.role = role;
//	}

	public Planet getPlanet() {
		return planet;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	public List<Settlement> getSettlementsId() {
		return settlementsId;
	}

	public void setSettlementsId(List<Settlement> settlementsId) {
		this.settlementsId = settlementsId;
	}
	
	public Double getPoints() {
		return points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", nick=" + nick + ", email=" + email + ", password=" + password + ", phone="
				+ phone + ", role=" + role + ", points=" + points + ", troupPoints=" + troupPoints + ", buildingPoints="
				+ buildingPoints + ", researchPoints=" + researchPoints + ", planet=" + planet + ", settlementsId="
				+ settlementsId + "]";
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

}
	

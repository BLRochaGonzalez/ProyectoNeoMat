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
	private Long userId;
	
	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;
	
	@Column(name = "nick", columnDefinition = "varchar(45)")
	private String nick;
	
	@Column(name = "email", columnDefinition = "varchar(80)", nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", columnDefinition = "varchar(18)")
	private String password;
	
	@Column(name = "phone", columnDefinition = "varchar(30)")
	private String phone;
	
	@Column(name = "role", columnDefinition = "varchar(10)", nullable = false)
	private String role;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "planet")
	private Planet planet;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Settlement> settlementsId = new ArrayList<>();

	protected User() {
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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

	@Override
	public String toString() {
		return "User [name=" + name + ", nick=" + nick + ", email=" + email + ", password=" + password + ", phone="
				+ phone + ", role=" + role + ", planet=" + planet + ", settlementsId=" + settlementsId + "]";
	}
}
	
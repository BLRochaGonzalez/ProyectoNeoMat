package org.iesalixar.bluisrochag.neomat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "settlement")
public class Settlement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private Long userId;

	@Column(name = "name", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String name;

	/*
	 * Estos datos siguientes se usarán para almacenar la cantidad de recursos en el
	 * asentamiento cuando el usuario se desconecte junto con el tiempo en
	 * milisegundos, para calcular la cantidad que tendrá cuando vuelva a
	 * reconectarse
	 */
	@Column(name = "wquantity", columnDefinition = "integer", nullable = false)
	private Integer wQuantity;

	@Column(name = "gquantity", columnDefinition = "integer", nullable = false)
	private Integer gQuantity;

	@Column(name = "cquantity", columnDefinition = "integer", nullable = false)
	private Integer cQuantity;

	@Column(name = "squantity", columnDefinition = "integer", nullable = false)
	private Integer sQuantity;

	@Column(name = "rquantity", columnDefinition = "integer", nullable = false)
	private Integer rQuantity;

	@Column(name = "equantity", columnDefinition = "integer", nullable = false)
	private Integer eQuantity;
	
	//tiempo de ejemplo para sobrescribir luego con el real
	@Column(name = "lastconnection", columnDefinition = "bigint")
    private Long lastConnection;
	
	public Settlement() {
		super();
	}

	public Settlement(String name, Integer wQuantity, Integer gQuantity, Integer cQuantity, Integer sQuantity,
			Integer rQuantity, Integer eQuantity, Long milis) {
		super();
		this.name = name;
		this.wQuantity = wQuantity;
		this.gQuantity = gQuantity;
		this.cQuantity = cQuantity;
		this.sQuantity = sQuantity;
		this.rQuantity = rQuantity;
		this.eQuantity = eQuantity;
		this.lastConnection = System.currentTimeMillis();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getwQuantity() {
		return wQuantity;
	}

	public void setwQuantity(Integer wQuantity) {
		this.wQuantity = wQuantity;
	}

	public Integer getgQuantity() {
		return gQuantity;
	}

	public void setgQuantity(Integer gQuantity) {
		this.gQuantity = gQuantity;
	}

	public Integer getcQuantity() {
		return cQuantity;
	}

	public void setcQuantity(Integer cQuantity) {
		this.cQuantity = cQuantity;
	}

	public Integer getsQuantity() {
		return sQuantity;
	}

	public void setsQuantity(Integer sQuantity) {
		this.sQuantity = sQuantity;
	}

	public Integer getrQuantity() {
		return rQuantity;
	}

	public void setrQuantity(Integer rQuantity) {
		this.rQuantity = rQuantity;
	}

	public Integer geteQuantity() {
		return eQuantity;
	}

	public void seteQuantity(Integer eQuantity) {
		this.eQuantity = eQuantity;
	}

	public Long getLastConnection() {
		return lastConnection;
	}

	public void setLastConnection(Long lastConnection) {
		this.lastConnection = lastConnection;
	}
	
}

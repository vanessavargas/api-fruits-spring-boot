package com.revisao.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Frutas {

	@Id
	@GeneratedValue
	private int id;
	private String nomeFruta;
	private double precoFruta;
	private Date validade;
	
	public Frutas(int id, String nomeFruta, double precoFruta) {
		super();
		this.setId(id);
		this.nomeFruta = nomeFruta;
		this.precoFruta = precoFruta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

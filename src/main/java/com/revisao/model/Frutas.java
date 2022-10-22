package com.revisao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Frutas {

	@Id
	@GeneratedValue
	private int idFruta;
	@Column
	private String nomeFruta;
	@Column
	private double precoFruta;
	@Column
	private Date validade;
	
	public Frutas(int id, String nomeFruta, double precoFruta) {
		super();
		this.idFruta = idFruta;
		this.nomeFruta = nomeFruta;
		this.precoFruta = precoFruta;
	}

}

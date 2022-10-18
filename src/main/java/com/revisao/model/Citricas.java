package com.revisao.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Citricas extends Frutas {
	//ATRIBUTORES
	private String origem;
	
	public Citricas (int id, String nomeFruta, double precoFruta) {
		super (id, nomeFruta, precoFruta);
	}
	
}

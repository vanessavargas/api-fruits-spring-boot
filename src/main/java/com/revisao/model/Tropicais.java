package com.revisao.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data

//CLASSE CRIADA POR HERANÇA
public class Tropicais extends Frutas {
	//ATRIBUTOS
	@Column
	private String origem;
	
	public Tropicais (int id, String nomeFruta, double precoFruta) {
		super (id, nomeFruta, precoFruta);
	}

}

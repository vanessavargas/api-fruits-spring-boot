package com.revisao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Citricas {
	
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column
		private String nomeFruta;
		@Column
		private double precoFruta;
		
		//GETTERS E SETTERS SOLICITADOS PELO SERVICE
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNomeFruta() {
			return nomeFruta;
		}
		public void setNomeFruta(String nomeFruta) {
			this.nomeFruta = nomeFruta;
		}
		public double getPrecoFruta() {
			return precoFruta;
		}
		public void setPrecoFruta(double precoFruta) {
			this.precoFruta = precoFruta;
		}

}
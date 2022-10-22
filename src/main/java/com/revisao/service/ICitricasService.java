package com.revisao.service;

import java.util.List;

import com.revisao.model.Citricas;

public interface ICitricasService {

	List<Citricas> getAll();
	Citricas getById (long id);
	Citricas save (Citricas citricas);
	Citricas update (Citricas citricas, long id);
	void delete (long id);
}

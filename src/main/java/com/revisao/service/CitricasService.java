package com.revisao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisao.model.Citricas;
import com.revisao.repositories.CitricasRepository;

@Service
public class CitricasService implements ICitricasService {
	
	@Autowired
	private CitricasRepository citricaRepo;
	
	@Override
	public Citricas getById(long id) { 
		return citricaRepo.findById(id).get();
	}
	
	//CREATE - SAVE
	@Override
	public Citricas save (Citricas citrica) {
		return citricaRepo.save(citrica);
	}
	
	//READ - FIND ALL
	@Override
	public List<Citricas> getAll() {
		return citricaRepo.findAll();	
		}
	
	// UPDATE
	@Override
	public Citricas update (Citricas citrica, long id) {
	
		Citricas citricasExistente = citricaRepo.findById(id).get();
		
		citricasExistente.setNomeFruta(citrica.getNomeFruta());
		citricasExistente.setPrecoFruta(citrica.getPrecoFruta());
		
		citricaRepo.save(citricasExistente);
		return citricasExistente;
	}
	
	//DELETE
	@Override
	public void delete (long id) {
		citricaRepo.deleteById(id);
	}
}

package com.revisao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revisao.model.Citricas;
import com.revisao.repositories.CitricasRepository;

@Service
public class CitricasService {
	@Autowired
	private CitricasRepository citricaRepo;
	
	//CREATE - SAVE
	public Citricas save (Citricas citrica) {
		return citricaRepo.save(citrica);
	}
	
	//READ - FIND ALL
	public List<Citricas> findAll() {
		return citricaRepo.findAll();	
		}
	
	// UPDATE
	public Citricas update (Citricas citrica) {
		findById(citrica.getId());
		return citricaRepo.save(citrica);
	}
	
	private void findById(int id) {
		// TODO Auto-generated method stub	
	}

	//DELETE
	public void delete (Long id) {
		citricaRepo.deleteById(id);
	}
}

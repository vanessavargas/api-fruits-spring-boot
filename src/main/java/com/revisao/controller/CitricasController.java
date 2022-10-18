package com.revisao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revisao.model.Citricas;
import com.revisao.service.CitricasService;

@RestController
@RequestMapping(value = "/citricas")
@CrossOrigin ("*")
public class CitricasController {

	@Autowired
	private CitricasService service;
	
	//CREATE - SAVE
	@PostMapping
	public ResponseEntity<Citricas> save (@RequestBody Citricas citrica) {
		Citricas obj = service.save(citrica);
		return ResponseEntity.ok().body(obj);
	}
	
	//READ - FIND ALL
	
	//UPDATE
	
	//DELETE
	
}

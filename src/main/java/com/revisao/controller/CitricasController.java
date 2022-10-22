package com.revisao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("{id}")
	public ResponseEntity<Citricas> getClienteById(@PathVariable("id") long CitricasId) { 
		return new ResponseEntity<Citricas>(service.getById(CitricasId), HttpStatus.OK);
	}
	
	//CREATE - SAVE
	@PostMapping
	public ResponseEntity<Citricas> save (@RequestBody Citricas citrica) {
		return new ResponseEntity<Citricas>(service.save(citrica), HttpStatus.CREATED);
	}
	
	//READ - FIND ALL
	@GetMapping
	public ResponseEntity<List<Citricas>> findAll() {
		List<Citricas> citricas = service.getAll();
		return ResponseEntity.ok().body(citricas);
	}
	
	//UPDATE
	@PutMapping ("{id}")
	public ResponseEntity<Citricas> update(@PathVariable("id") long id, @RequestBody Citricas citrica) {
		return new ResponseEntity<Citricas>(service.update(citrica, id), HttpStatus.OK);
	}
	
	//DELETE
	@DeleteMapping ("{id}")
	public ResponseEntity<String> delete(@PathVariable ("id") long id){
		service.delete(id);
		return new ResponseEntity<String>("Fruta deletada!", HttpStatus.OK);
	}
}

package com.revisao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revisao.model.Citricas;

public interface CitricasRepository extends JpaRepository<Citricas, Long> {
	
}

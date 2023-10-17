package com.senai.mateus.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.mateus.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}


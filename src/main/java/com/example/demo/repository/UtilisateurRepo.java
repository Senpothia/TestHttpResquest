package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer>{
	
	

}

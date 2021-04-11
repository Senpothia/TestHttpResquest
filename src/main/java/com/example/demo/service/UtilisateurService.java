package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Utilisateur;
import com.example.demo.repository.UtilisateurRepo;

@Service
public class UtilisateurService  {
	
	@Autowired
	UtilisateurRepo utilisateurRepo;
	
	
	public void enregistrer(Utilisateur utilisateur){
		
		utilisateurRepo.save(utilisateur);
		
	}
	
	

}

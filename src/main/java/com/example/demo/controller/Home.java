package com.example.demo.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Utilisateur;
import com.example.demo.service.UtilisateurService;

@Controller
public class Home {

	@Autowired
	UtilisateurService utilisateurService;

	@GetMapping("/")
	String accueil() {

		return "ok";
	}

	@GetMapping("/save")
	String sauvergarderGet() {

		Utilisateur user = new Utilisateur();
		user.setNom("Smith");
		user.setPrenom("John");
		user.setRole("ADMIN");
		user.setEmail("john@gmail.com");
		user.setPassword("1236");
		utilisateurService.enregistrer(user);

		return "ok";
	}

	

	@PostMapping("/sauvegarder")
	String sauvergarder(@RequestBody Utilisateur utilisateur) {

		System.out.println(utilisateur.toString());
		utilisateurService.enregistrer(utilisateur);

		return "ok";
	}

	@PostMapping("/save")
	ResponseEntity<String> sauvergarder2(@RequestBody Utilisateur utilisateur) {

		System.out.println(utilisateur.toString());
		utilisateurService.enregistrer(utilisateur);

		return new ResponseEntity<>("sauvegarde ok", HttpStatus.OK);
	}

}

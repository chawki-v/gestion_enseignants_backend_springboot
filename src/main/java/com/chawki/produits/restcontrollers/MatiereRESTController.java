package com.chawki.produits.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.chawki.produits.entities.Matiere;
import com.chawki.produits.repos.MatiereRepository;

@RestController
@RequestMapping("/api/mat")
@CrossOrigin("*")
public class MatiereRESTController {
	@Autowired
	MatiereRepository matiereRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Matiere> getAllMatiere() {
		return matiereRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Matiere getMatiereById(@PathVariable("id") Long id) {
		return matiereRepository.findById(id).get();
	}
	


}
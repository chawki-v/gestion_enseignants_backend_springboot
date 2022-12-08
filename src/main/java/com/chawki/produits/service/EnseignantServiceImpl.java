package com.chawki.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chawki.produits.entities.Matiere;
import com.chawki.produits.entities.Enseignant;
import com.chawki.produits.repos.EnseignantRepository;

@Service
public class EnseignantServiceImpl implements EnseignantService {
	@Autowired
	EnseignantRepository enseignantRepository;

	@Override
	public Enseignant saveEnseignant(Enseignant p) {
		return enseignantRepository.save(p);
	}

	@Override
	public Enseignant updateEnseignant(Enseignant p) {
		return enseignantRepository.save(p);
	}

	@Override
	public void deleteEnseignant(Enseignant p) {
		enseignantRepository.delete(p);
	}

	@Override
	public void deleteEnseignantById(Long id) {
		enseignantRepository.deleteById(id);
	}

	@Override
	public Enseignant getEnseignant(Long id) {
		return enseignantRepository.findById(id).get();
	}

	@Override
	public List<Enseignant> getAllEnseignant() {
		return enseignantRepository.findAll();
	}

	@Override
	public List<Enseignant> findByNomEnseignant(String nom) {
		return enseignantRepository.findByNomEnseignant(nom);
	}

	@Override
	public List<Enseignant> findByNomEnseignantContains(String nom) {
		return enseignantRepository.findByNomEnseignantContains(nom);
	}

	@Override
	public List<Enseignant> findByNom(String nom) {



	return enseignantRepository.findByNom(nom);
	}

	@Override
	public List<Enseignant> findByMatiere(Matiere matiere) {
		return enseignantRepository.findByMatiere(matiere);
	}

	@Override
	public List<Enseignant> findByMatiereIdMat(Long id) {
		return enseignantRepository.findByMatiereIdMat(id);
	}

	@Override
	public List<Enseignant> findByOrderByNomEnseignantAsc() {
		return enseignantRepository.findByOrderByNomEnseignantAsc();
	}

	@Override
	public List<Enseignant> trierEnseignantsNoms() {
		return enseignantRepository.trierEnseignantNoms();
	}
}

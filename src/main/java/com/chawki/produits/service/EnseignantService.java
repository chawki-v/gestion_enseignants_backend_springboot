package com.chawki.produits.service;

import java.util.List;

import com.chawki.produits.entities.Matiere;
import com.chawki.produits.entities.Enseignant;

public interface EnseignantService {
	Enseignant saveEnseignant(Enseignant p);

	Enseignant updateEnseignant(Enseignant p);

	void deleteEnseignant(Enseignant p);

	void deleteEnseignantById(Long id);

	Enseignant getEnseignant(Long id);

	List<Enseignant> getAllEnseignant();

	List<Enseignant> findByNomEnseignant(String nom);

	List<Enseignant> findByNomEnseignantContains(String nom);

	List<Enseignant> findByNom(String nom);

	List<Enseignant> findByMatiere(Matiere matiere);

	List<Enseignant> findByMatiereIdMat(Long id);

	List<Enseignant> findByOrderByNomEnseignantAsc();

	List<Enseignant> trierEnseignantsNoms();
}

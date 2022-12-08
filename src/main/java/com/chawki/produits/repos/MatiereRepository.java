package com.chawki.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.chawki.produits.entities.Matiere;


@RepositoryRestResource(path = "mat")
@CrossOrigin("http://localhost:4200/")
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
}
package com.sopra.referentielcollab.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sopra.referentielcollab.pojo.Collaborateur;

public interface CollaborateurRepository extends CrudRepository<Collaborateur, Long> {

	public Collaborateur findById(Long id);

	public Collaborateur findByMatricule(long matricule);

	public List<Collaborateur> findByNom(String nom);

	public List<Collaborateur> findByPrenom(String prenom);

	public Collaborateur findByEmail(String email);
}

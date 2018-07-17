package fr.gaelcarre.magnusfantasy.repository;

import org.springframework.data.repository.CrudRepository;

import fr.gaelcarre.magnusfantasy.pojo.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

	Utilisateur findByLogin(String login);

}

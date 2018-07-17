package fr.gaelcarre.magnusfantasy.repository;

import org.springframework.data.repository.CrudRepository;

import fr.gaelcarre.magnusfantasy.pojo.Joueur;

public interface JoueurRepository extends CrudRepository<Joueur, Long> {

}

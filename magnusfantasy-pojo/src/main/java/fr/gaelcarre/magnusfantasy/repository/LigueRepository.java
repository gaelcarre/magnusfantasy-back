package fr.gaelcarre.magnusfantasy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.gaelcarre.magnusfantasy.pojo.Ligue;

public interface LigueRepository extends CrudRepository<Ligue, Long> {

	public List<Ligue> findByUtilisateurs_Id(Long id);

	public List<Ligue> findByCreateurId(Long id);

	public Ligue findById(Long id);

}

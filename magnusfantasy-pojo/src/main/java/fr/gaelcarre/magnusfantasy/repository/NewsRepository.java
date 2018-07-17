package fr.gaelcarre.magnusfantasy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.gaelcarre.magnusfantasy.pojo.News;

public interface NewsRepository extends CrudRepository<News, Long> {

	List<News> findAll();

}

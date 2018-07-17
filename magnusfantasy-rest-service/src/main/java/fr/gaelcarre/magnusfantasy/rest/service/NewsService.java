package fr.gaelcarre.magnusfantasy.rest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gaelcarre.magnusfantasy.pojo.News;
import fr.gaelcarre.magnusfantasy.repository.NewsRepository;

@RestController
@RequestMapping
public class NewsService {

	private static final Logger logger = LoggerFactory.getLogger(NewsService.class);

	@Autowired
	private NewsRepository newsRepository;

	@GetMapping("/news")
	public ResponseEntity<List<News>> news() {
		return ResponseEntity.ok(this.newsRepository.findAll());
	}

}

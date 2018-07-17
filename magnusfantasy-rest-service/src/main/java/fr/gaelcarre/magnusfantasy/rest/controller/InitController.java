package fr.gaelcarre.magnusfantasy.rest.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import fr.gaelcarre.magnusfantasy.pojo.News;
import fr.gaelcarre.magnusfantasy.pojo.Utilisateur;
import fr.gaelcarre.magnusfantasy.pojo.UtilisateurRole;
import fr.gaelcarre.magnusfantasy.repository.NewsRepository;
import fr.gaelcarre.magnusfantasy.repository.UtilisateurRepository;
import fr.gaelcarre.magnusfantasy.repository.UtilisateurRoleRepository;

@Component
public class InitController {

	private Logger logger = LoggerFactory.getLogger(InitController.class);

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Autowired
	private NewsRepository newsRepository;

	@Autowired
	private UtilisateurRoleRepository roleRepository;

	public void init() {

		this.logger.debug("Init dataset");

		this.utilisateurRepository.save(
				new Utilisateur("gca", (new BCryptPasswordEncoder(11)).encode("gca"), true, "gaelgael@gael.com", 1));
		this.roleRepository.save(new UtilisateurRole("gca", "ROLE_ADMIN"));
		this.roleRepository.save(new UtilisateurRole("gca", "ROLE_USER"));
		this.newsRepository.save(new News("DEV", "En cours de developpement", new Date(), "dev.jpeg"));
		this.newsRepository.save(new News("DEV", "En cours de developpement", new Date(), "dev.jpeg"));
		this.newsRepository.save(new News("DEV", "En cours de developpement", new Date(), "dev.jpeg"));
		this.newsRepository.save(new News("DEV", "En cours de developpement", new Date(), "dev.jpeg"));

	}

}

package fr.gaelcarre.magnusfantasy.rest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gaelcarre.magnusfantasy.pojo.Ligue;
import fr.gaelcarre.magnusfantasy.pojo.Utilisateur;
import fr.gaelcarre.magnusfantasy.repository.LigueRepository;
import fr.gaelcarre.magnusfantasy.repository.UtilisateurRepository;

@RestController
@RequestMapping()
public class UtilisateurService {

	private static final Logger logger = LoggerFactory.getLogger(UtilisateurService.class);

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Autowired
	private LigueRepository ligueRepository;

	@GetMapping("/utilisateurs/connexion")
	public ResponseEntity<Utilisateur> connexion(Authentication authentication) {

		Utilisateur utilisateur = this.utilisateurRepository.findByLogin(authentication.getName());

		if (utilisateur == null) {
			return ResponseEntity.notFound().build();
		} else
			return ResponseEntity.ok(utilisateur);

	}

	@PostMapping("/register")
	public ResponseEntity<Void> register(@RequestBody Utilisateur utilisateur) {

		logger.error(utilisateur.toString());

		if (utilisateur != null) {
			this.utilisateurRepository.save(utilisateur);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	// @PostMapping("login")
	// public ResponseEntity<Utilisateur> login(@RequestBody Utilisateur
	// requestutilisateur,
	// Authentication authentication) {
	//
	// return ResponseEntity.ok(util);
	// }

	@RequestMapping("/user")
	public ResponseEntity<Utilisateur> user(Authentication authentication) {
		Utilisateur util = this.utilisateurRepository.findByLogin(authentication.getName());

		if (util == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(util);
		}
	}

	@RequestMapping("/utilisateur/{id}/ligues")
	public ResponseEntity<List<Ligue>> ligues(@PathVariable("id") long id) {

		List<Ligue> ligues = this.ligueRepository.findByUtilisateurs_Id(id);
		ligues.addAll(this.ligueRepository.findByCreateurId(id));

		return ResponseEntity.ok(ligues);
	}
}

package com.sopra.referentielcollab.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.referentielcollab.pojo.Collaborateur;
import com.sopra.referentielcollab.repository.CollaborateurRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class CollaborateurController {

	private static final Logger logger = LoggerFactory.getLogger(CollaborateurController.class);

	@Autowired
	private CollaborateurRepository repository;

	@GetMapping("/collaborateurs")
	public ResponseEntity<List<Collaborateur>> getAllUsers() {

		List<Collaborateur> list = new ArrayList<>();
		list.add(new Collaborateur(5433, "CARRE", "Gael", "gael.carre", "GCA"));

		return new ResponseEntity<List<Collaborateur>>(list, HttpStatus.ACCEPTED);
		/*
		 * List<Collaborateur> listCollab = ; if
		 * (CollectionUtils.isEmpty(listCollab)) { return new
		 * ResponseEntity<>(HttpStatus.NOT_FOUND); } return new
		 * ResponseEntity<>(listCollab, HttpStatus.OK);
		 */
	}

	@GetMapping("/collaborateurs/{idCollab}")
	public ResponseEntity<List<Collaborateur>> getUser(@PathVariable String idCollab) {
		return null;
		/*
		 * Collaborateur collab = ; if (collab == null) { return new
		 * ResponseEntity<>(HttpStatus.NOT_FOUND); } return new
		 * ResponseEntity<>(collab, HttpStatus.OK);
		 */
	}

	@PostMapping("/collaborateurs")
	public ResponseEntity<Void> createUser(@RequestBody Collaborateur newCollab) {
		// repository.save(new Collaborateur(newCollab.getPrenom(),
		// newCollab.getNom(), newCollab.getLogin()));
		return ResponseEntity.ok().build();
	}

	@PostMapping("/collaborateurs/connexion")
	public ResponseEntity<Void> connect() {
		logger.info("Connexion");
		return ResponseEntity.ok().build();
	}
}

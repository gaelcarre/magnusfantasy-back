package fr.gaelcarre.magnusfantasy.rest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gaelcarre.magnusfantasy.pojo.Etat;
import fr.gaelcarre.magnusfantasy.pojo.Ligue;
import fr.gaelcarre.magnusfantasy.repository.LigueRepository;

@RestController
@RequestMapping()
public class LigueService {

	private static final Logger logger = LoggerFactory.getLogger(LigueService.class);

	@Autowired
	private LigueRepository ligueRepository;

	@PostMapping("/ligue")
	public ResponseEntity<Ligue> createLigue(@RequestBody Ligue ligue) {

		System.out.println(ligue);

		if (ligue != null) {
			ligue.setEtat(Etat.PAS_COMMENCEE);
			ligue = this.ligueRepository.save(ligue);
			return ResponseEntity.ok(ligue);
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@GetMapping("ligue/{id}")
	public ResponseEntity<Ligue> getLigueById(@PathVariable Long id) {
		return ResponseEntity.ok(this.ligueRepository.findById(id));
	}

}

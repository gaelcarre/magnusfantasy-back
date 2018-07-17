package fr.gaelcarre.magnusfantasy.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Roster {

	private @Id @GeneratedValue long id;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name = "ligue_id")
	private Ligue ligue;
	@ManyToMany(mappedBy = "rosters")
	private List<Joueur> joueurs;

}

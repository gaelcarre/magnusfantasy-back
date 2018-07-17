package fr.gaelcarre.magnusfantasy.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MatchReel {

	private @Id @GeneratedValue long id;

	@ManyToOne
	@JoinColumn(name = "journee_id")
	private JourneeReelle journee;

	@ManyToOne
	@JoinColumn(name = "domicile_id")
	private Club domicile;
	@ManyToOne
	@JoinColumn(name = "exterieur_id")
	private Club exterieur;

	@OneToMany(mappedBy = "match")
	private List<StatistiqueMatch> statistiqueMatchs;

}

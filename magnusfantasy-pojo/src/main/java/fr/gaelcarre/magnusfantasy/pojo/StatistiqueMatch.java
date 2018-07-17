package fr.gaelcarre.magnusfantasy.pojo;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StatistiqueMatch {

	private @Id @GeneratedValue long id;

	@ManyToOne
	@JoinColumn(name = "match_id")
	private MatchReel match;
	@ManyToOne
	@JoinColumn(name = "joueur_id")
	private Joueur joueur;

	@Enumerated
	private CleStatistique cle;
	private String valueString;
	private Long valueLong;
}

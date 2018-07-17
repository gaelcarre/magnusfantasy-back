package fr.gaelcarre.magnusfantasy.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class JourneeFictive {

	private @Id @GeneratedValue long id;

	@ManyToOne
	@JoinColumn(name = "calendrier_id")
	private CalendrierFictif calendrier;

	private Integer numeroJournee;
	private Boolean terminee;

	@OneToMany(mappedBy = "journee")
	private List<MatchFantasy> matchs;

}

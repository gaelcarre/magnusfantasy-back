package fr.gaelcarre.magnusfantasy.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MatchFantasy {

	private @Id @GeneratedValue long id;

	@ManyToOne
	@JoinColumn(name = "journee_id")
	private JourneeFictive journee;

}

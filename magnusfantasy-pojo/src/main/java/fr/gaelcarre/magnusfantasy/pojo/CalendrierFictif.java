package fr.gaelcarre.magnusfantasy.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CalendrierFictif {

	private @Id @GeneratedValue long id;

	@OneToMany(mappedBy = "calendier")
	private List<JourneeFictive> journees;
}

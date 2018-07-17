package fr.gaelcarre.magnusfantasy.pojo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ligue {

	private @Id @GeneratedValue long id;
	private String nom;

	@ManyToMany(mappedBy = "ligues")
	private List<Utilisateur> utilisateurs;

	@ManyToOne()
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur createur;

	private String description;

	@Enumerated
	private Etat etat;

	@OneToMany(mappedBy = "ligue")
	private List<Roster> rosters;

	private Date dateMercato;
	private Date dateDebut;

	public Ligue() {
	}

	public Ligue(String nom, List<Utilisateur> utilisateurs, Utilisateur createur, String description, Etat etat) {
		super();
		this.nom = nom;
		this.utilisateurs = utilisateurs;
		this.createur = createur;
		this.description = description;
		this.etat = etat;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Utilisateur getCreateur() {
		return this.createur;
	}

	public void setCreateur(Utilisateur createur) {
		this.createur = createur;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Etat getEtat() {
		return this.etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

}

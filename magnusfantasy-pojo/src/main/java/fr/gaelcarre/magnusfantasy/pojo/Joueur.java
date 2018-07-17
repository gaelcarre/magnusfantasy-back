package fr.gaelcarre.magnusfantasy.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Joueur {

	private @Id @GeneratedValue long id;

	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String pays;

	@Enumerated
	private Position position;

	@ManyToOne
	@JoinColumn(name = "club_id")
	private Club club;

	@OneToMany(mappedBy = "joueur")
	private List<StatistiqueMatch> statistiqueMatchs;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "roster_joueur", joinColumns = @JoinColumn(name = "roster_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "joueur_id", referencedColumnName = "id"))
	private List<Roster> rosters;

	public Joueur(long id, String nom, String prenom, Date dateDeNaissance, String pays, Position position, Club club) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.pays = pays;
		this.position = position;
		this.club = club;
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

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return this.dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Club getClub() {
		return this.club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

}

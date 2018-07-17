package fr.gaelcarre.magnusfantasy.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Club {

	private @Id @GeneratedValue long id;
	private String nom;
	private String nomCourt;
	private String ville;
	private String logoImage;

	@OneToMany(mappedBy = "club")
	private List<Joueur> joueurs;

	@OneToMany(mappedBy = "domicile")
	private List<MatchReel> matchsDomicile;

	@OneToMany(mappedBy = "exterieur")
	private List<MatchReel> matchsExterieur;

	public Club(long id, String nom, String nomCourt, String ville, String logoImage, List<Joueur> joueurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.nomCourt = nomCourt;
		this.ville = ville;
		this.logoImage = logoImage;
		this.joueurs = joueurs;
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

	public String getNomCourt() {
		return this.nomCourt;
	}

	public void setNomCourt(String nomCourt) {
		this.nomCourt = nomCourt;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLogoImage() {
		return this.logoImage;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	public List<Joueur> getJoueurs() {
		return this.joueurs;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

}

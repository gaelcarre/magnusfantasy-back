package com.sopra.referentielcollab.pojo;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Collaborateur extends Utilisateur {

	private int matricule;
	private String nom;
	private String prenom;
	private String email;
	private String statut; // Disponible ou non
	private String disponibilites; // Date de disponibilites et durée de la
									// disponibilite
	private String trigramme;
	private String cv; // Chemin vers le CV
	private String langue[];
	private String souhaitEv;
	private String souhaitGeo;
	private ArrayList listClients = new ArrayList();
	private ArrayList aptitudes = new ArrayList();
	private String fonction;

	protected Collaborateur() {
	}

	public Collaborateur(String prenom, String nom, String login) {
		this.prenom = prenom;
		this.nom = nom;
		this.setLogin(login);
	}

	public Collaborateur(int matricule, String nom, String prenom, String email, String trigramme) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.trigramme = trigramme;
	}

	public Collaborateur(int matricule, String nom, String prenom, String email, String statut, String disponibilites,
			String trigramme, String cv, String[] langue, String souhaitEv, String souhaitGeo, ArrayList listClients,
			ArrayList aptitudes, String fonction) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.statut = statut;
		this.disponibilites = disponibilites;
		this.trigramme = trigramme;
		this.cv = cv;
		this.langue = langue;
		this.souhaitEv = souhaitEv;
		this.souhaitGeo = souhaitGeo;
		this.listClients = listClients;
		this.aptitudes = aptitudes;
		this.fonction = fonction;
	}

	public long getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getDisponibilites() {
		return disponibilites;
	}

	public void setDisponibilites(String disponibilites) {
		this.disponibilites = disponibilites;
	}

	public String getTrigramme() {
		return trigramme;
	}

	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String[] getLangue() {
		return langue;
	}

	public void setLangue(String[] langue) {
		this.langue = langue;
	}

	public String getSouhaitEv() {
		return souhaitEv;
	}

	public void setSouhaitEv(String souhaitEv) {
		this.souhaitEv = souhaitEv;
	}

	public String getSouhaitGeo() {
		return souhaitGeo;
	}

	public void setSouhaitGeo(String souhaitGeo) {
		this.souhaitGeo = souhaitGeo;
	}

	public ArrayList getListClients() {
		return listClients;
	}

	public void setListClients(ArrayList listClients) {
		this.listClients = listClients;
	}

	public ArrayList getAptitudes() {
		return aptitudes;
	}

	public void setAptitudes(ArrayList aptitudes) {
		this.aptitudes = aptitudes;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
}

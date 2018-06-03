package com.sopra.referentielcollab.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	
	private @Id @GeneratedValue long idCli;
	private String nom;

	public Client(long idCli, String nom) {
		super();
		this.idCli = idCli;
		this.nom = nom;
	}
	
	public long getIdCli() {
		return idCli;
	}
	public void setIdCli(long idCli) {
		this.idCli = idCli;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}

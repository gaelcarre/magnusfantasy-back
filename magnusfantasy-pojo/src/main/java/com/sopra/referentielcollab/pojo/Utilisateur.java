package com.sopra.referentielcollab.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	
	private @Id @GeneratedValue long id;
	private String login;
	private String mdp;
	private boolean admin;
	
	public Utilisateur() {	}
	
	public Utilisateur(long id, String login, String mdp, boolean admin) {
		super();
		this.id = id;
		this.login = login;
		this.mdp = mdp;
		this.admin = admin;
	}
	
	public long getId() {
		return id;
	}
	public void setIdUt(long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	

}

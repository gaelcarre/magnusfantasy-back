package fr.gaelcarre.magnusfantasy.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

	private @Id @GeneratedValue long id;
	private String login;
	private String mdp;
	private boolean administrator;
	private String email;
	private int enabled;

	@ManyToMany
	@JoinTable(name = "ligue_utilisateur", joinColumns = @JoinColumn(name = "ligue_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "utilisateur_id", referencedColumnName = "id"))
	private List<Ligue> ligues;

	@OneToMany(mappedBy = "createur")
	private List<Ligue> mesligues;

	@OneToMany(mappedBy = "utilisateur")
	private List<Roster> rosters;

	public Utilisateur() {
	}

	public Utilisateur(String login, String mdp, boolean administrator, String email, int enabled) {
		super();
		this.login = login;
		this.mdp = mdp;
		this.administrator = administrator;
		this.email = email;
		this.enabled = enabled;
	}

	public long getId() {
		return this.id;
	}

	public void setIdUt(long id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isAdmin() {
		return this.administrator;
	}

	public void setAdmin(boolean admin) {
		this.administrator = admin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public List<Ligue> getLigues() {
		return this.ligues;
	}

	public void setLigues(List<Ligue> ligues) {
		this.ligues = ligues;
	}

}

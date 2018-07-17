package fr.gaelcarre.magnusfantasy.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class News {

	public News() {
	}

	public News(String titre, String contenu, Date date, String image) {
		super();
		this.titre = titre;
		this.contenu = contenu;
		this.date = date;
		this.image = image;
	}

	private @Id @GeneratedValue long id;
	private String titre;
	private String contenu;
	private Date date;
	private String image;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}

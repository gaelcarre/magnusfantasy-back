package com.sopra.referentielcollab.pojo;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mission {

	private @Id @GeneratedValue long id;
	private int code;
	private String nomMis;
	private String description;
	private ArrayList listCollab = new ArrayList();
	private Date dateDeb;
	private Date dateFin;
	private boolean estEnCours;
	private ArrayList listTechno = new ArrayList();
	private String environnement;
	private int avancement;
	private String guide;
	private String domaine;
	private String modeIntervention;
	private String remarqueCollab[];

	public Mission(long id, int code, String nomMis, String description, ArrayList listCollab, Date dateDeb,
			Date dateFin, boolean estEnCours, ArrayList listTechno, String environnement, int avancement, String guide,
			String domaine, String modeIntervention, String[] remarqueCollab) {
		super();
		this.id = id;
		this.code = code;
		this.nomMis = nomMis;
		this.description = description;
		this.listCollab = listCollab;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.estEnCours = estEnCours;
		this.listTechno = listTechno;
		this.environnement = environnement;
		this.avancement = avancement;
		this.guide = guide;
		this.domaine = domaine;
		this.modeIntervention = modeIntervention;
		this.remarqueCollab = remarqueCollab;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNomMis() {
		return nomMis;
	}

	public void setNomMis(String nomMis) {
		this.nomMis = nomMis;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList getListCollab() {
		return listCollab;
	}

	public void setListCollab(ArrayList listCollab) {
		this.listCollab = listCollab;
	}

	public Date getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isEstEnCours() {
		return estEnCours;
	}

	public void setEstEnCours(boolean estEnCours) {
		this.estEnCours = estEnCours;
	}

	public ArrayList getListTechno() {
		return listTechno;
	}

	public void setListTechno(ArrayList listTechno) {
		this.listTechno = listTechno;
	}

	public String getEnvironnement() {
		return environnement;
	}

	public void setEnvironnement(String environnement) {
		this.environnement = environnement;
	}

	public int getAvancement() {
		return avancement;
	}

	public void setAvancement(int avancement) {
		this.avancement = avancement;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getModeIntervention() {
		return modeIntervention;
	}

	public void setModeIntervention(String modeIntervention) {
		this.modeIntervention = modeIntervention;
	}

	public String[] getRemarqueCollab() {
		return remarqueCollab;
	}

	public void setRemarqueCollab(String[] remarqueCollab) {
		this.remarqueCollab = remarqueCollab;
	}
}

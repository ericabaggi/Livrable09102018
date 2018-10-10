package org.formation.modele;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titre;
	private String auteur;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "bibliotheque_id")
	private Bibliotheque bibliotheque;

	public Livre() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Bibliotheque getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliothèque(Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", bibliotheque=" + bibliotheque + "]";
	}

}

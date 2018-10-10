package org.formation.modele;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bibliotheque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String localisation;
	@OneToMany(mappedBy = "bibliotheque", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Livre> livres = new HashSet<>();

	public Bibliotheque() {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

	public void addLivre(Livre l) {
		livres.add(l);
		l.setBibliothèque(this);
	}


}

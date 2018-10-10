package org.formation.main;

import org.formation.dao.Dao;
import org.formation.dao.DaoImplementation;
import org.formation.modele.Bibliotheque;
import org.formation.modele.Livre;

public class Main {

	public static void main(String[] args) {
		Dao dao = new DaoImplementation();

		Bibliotheque b = new Bibliotheque();
		b.setLocalisation("all�e F57");

		Livre l4 = new Livre();
		l4.setAuteur("Montesquieu");
		l4.setTitre("Les lettres persanes");

		Livre l2 = new Livre();
		l2.setAuteur("Hom�re");
		l2.setTitre("L'Odyss�e");

		Livre l3 = new Livre();
		l3.setTitre("Madame Bovary");
		l3.setAuteur("Gustave Flaubert");

		b.addLivre(l4);
		b.addLivre(l2);
		b.addLivre(l3);

		dao.createBi(b);
		Livre l5 = dao.findById(1);
		l5.setAuteur("Corneille");
		dao.updateBook(l5);
		

	}

}

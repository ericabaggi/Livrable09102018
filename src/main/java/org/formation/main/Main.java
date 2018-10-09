package org.formation.main;

import org.formation.dao.Dao;
import org.formation.dao.DaoImplementation;
import org.formation.modele.Livre;

public class Main {

	public static void main(String[] args) {
		Dao dao = new DaoImplementation();
		Livre l = new Livre();
		l.setAuteur("Montesqieu");
		l.setTitre("Les lettres persanes");
		dao.create(l);

		Livre l2 = dao.findById(1);
		System.out.println(l2);
		l2.setAuteur("Victor Hugo");
		dao.update(l2);
	}

}

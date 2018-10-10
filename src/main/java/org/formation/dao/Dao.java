package org.formation.dao;

import org.formation.modele.Bibliotheque;
import org.formation.modele.Livre;

public interface Dao {
	public void createBi(Bibliotheque b);

	public void createBook(Livre l);

	public void deleteBi(Bibliotheque b);

	public void deleteBook(Livre l);

	public void updateBi(Bibliotheque b);
	
	public void updateBook(Livre l);

	public Livre findById(int id);

}

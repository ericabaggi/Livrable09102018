package org.formation.dao;

import org.formation.modele.Livre;

public interface Dao {
	public void create(Livre l);

	public void delete(Livre l);

	public void update(Livre l);

	public Livre findById(int id);

}

package org.formation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.modele.Bibliotheque;
import org.formation.modele.Livre;

public class DaoImplementation implements Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

	@Override
	public void createBi(Bibliotheque b) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.persist(b);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}

	@Override
	public void deleteBi(Bibliotheque b) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.remove(b);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}

	@Override
	public void updateBi(Bibliotheque b) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.merge(b);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}

	@Override
	public Livre findById(int id) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		Livre l = null;
		try {
			trx.begin();
			l = em.find(Livre.class, id);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}
		return l;

	}

	@Override
	public void createBook(Livre l) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.persist(l);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}

	@Override
	public void deleteBook(Livre l) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.remove(l);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}

	@Override
	public void updateBook(Livre l) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			em.merge(l);
			trx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trx != null)
				trx.rollback();
		} finally {
			if (em != null)
				em.close();
		}

	}
	

}

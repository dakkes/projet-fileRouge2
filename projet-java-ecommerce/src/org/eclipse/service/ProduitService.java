 package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.dao.ProduitDao;
import org.eclipse.model.Produit;

public class ProduitService {
	private ProduitDao produitDao = new ProduitDao();

	public ProduitService() {

	}

	public Produit save(Produit produit) {
		return produitDao.save(produit);
	}
	
	 
	
	public void remove(int id) {
		produitDao.remove(produitDao.findById(id));
	}
	
	
	public void update(int id) {
		produitDao.remove(produitDao.findById(id));
	}

	public ArrayList<Produit> findAll() {
		return (ArrayList<Produit>) produitDao.findAll();
	}

	
}

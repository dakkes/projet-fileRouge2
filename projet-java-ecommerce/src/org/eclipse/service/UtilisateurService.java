  package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.dao.UtilisateurDao;
import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;

public class UtilisateurService {
	private UtilisateurDao utilisateurDao = new UtilisateurDao();

	public UtilisateurService() {

	}

	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}
	
	 
	
	public void remove(int id) {
		utilisateurDao.remove(utilisateurDao.findById(id));
	}
	
	
	public void update(int id) {
		utilisateurDao.remove(utilisateurDao.findById(id));
	}

	public ArrayList<Utilisateur> findAll() {
		return (ArrayList<Utilisateur>) utilisateurDao.findAll();
	}
	public  Utilisateur findByNomAndPrenom(String nom, String prenom) {

		return utilisateurDao.findByNomAndPrenom(nom, prenom);
	}

	
}
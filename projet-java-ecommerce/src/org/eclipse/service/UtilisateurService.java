 package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Utilisateur;

public class UtilisateurService {
	private ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

	public UtilisateurService() {
		utilisateurs.add(new Utilisateur(1, "zlatan","ibra", "client"));
		utilisateurs.add(new Utilisateur(2, "tilo","tilo", "client"));
		utilisateurs.add(new Utilisateur(3, "john","wick", "vendeur"));
		utilisateurs.add(new Utilisateur(4, "bill","gates", "vendeur"));
	}
	
	public Utilisateur findByNomAndPrenom(String nom, String prenom) {
		for(Utilisateur utilisateur: utilisateurs) {
			if(utilisateur.getNom().equals(nom) &&utilisateur.getPrenom().equals(prenom)) {
				return utilisateur;
			}
		}
		return null;
	}
}

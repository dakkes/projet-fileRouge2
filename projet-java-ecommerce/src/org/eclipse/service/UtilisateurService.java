package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Utilisateur;

public class UtilisateurService {

	private ArrayList<Utilisateur> utilisateurs;

	public UtilisateurService() {
		utilisateurs = new ArrayList<Utilisateur>();
	}

	public UtilisateurService(ArrayList<Utilisateur> utilisateurs) {
		super();
		this.utilisateurs = utilisateurs;
	}

	public ArrayList<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public void save(Utilisateur utilisateur) {
		utilisateurs.add(utilisateur);
	}

	public void remove(Utilisateur utilisateur) {
		utilisateurs.remove(utilisateur);
	}

	public void update(Utilisateur utilisateur) {
		for (Utilisateur utilis : utilisateurs) {
			if (utilis.getId() == utilisateur.getId()) {
				utilis = utilisateur;
			}
		}
	}

	public ArrayList<Utilisateur> findAll() {
		return utilisateurs;
	}

	public Utilisateur findById(int id) {
		for (int i = 0; i < utilisateurs.size(); i++) {
			Utilisateur findUtilisateurById = utilisateurs.get(i);
			if (id == findUtilisateurById.getId()) {
				return utilisateurs.get(i);
			}
		}
		return null;
	}

	public Utilisateur findByLoginAndPassword(String login, String password) {
		for (int i = 0; i < utilisateurs.size(); i++) {
			Utilisateur utili = utilisateurs.get(i);
			if ((login.equals(utili.getLogin())) && (password.equals(utili.getMotDePasse()))) {
				return utilisateurs.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "UtilisateurService [utilisateurs=" + utilisateurs + "]";
	}

}
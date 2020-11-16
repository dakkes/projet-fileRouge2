package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Commande;

public class CommandeService {

	private ArrayList<Commande> commandes;

	public CommandeService() {
		commandes = new ArrayList<Commande>();
	}

	public CommandeService(ArrayList<Commande> commandes) {
		super();
		this.commandes = commandes;
	}

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

	public void save(Commande commande) {
		commandes.add(commande);
	}

	public void remove(Commande commande) {
		commandes.remove(commande);
	}

	public void update(Commande commande) {
		for (Commande command : commandes) {
			if (command.getId() == commande.getId()) {
				command = commande;
			}
		}
	}

	public ArrayList<Commande> findAll() {
		return commandes;
	}

	public Commande findById(int id) {
		for (int i = 0; i < commandes.size(); i++) {
			Commande findCommandeById = commandes.get(i);
			if (id == findCommandeById.getId()) {
				return commandes.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "CommandeService [commandes=" + commandes + "]";
	}

}
package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.LigneCommande;

public class LigneCommandeService {

	private ArrayList<LigneCommande> lignesCommande;

	public LigneCommandeService() {
		lignesCommande = new ArrayList<LigneCommande>();
	}

	public LigneCommandeService(ArrayList<LigneCommande> lignesCommande) {
		super();
		this.lignesCommande = lignesCommande;
	}

	public ArrayList<LigneCommande> getLignesCommande() {
		return lignesCommande;
	}

	public void setLignesCommande(ArrayList<LigneCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}

	public void save(LigneCommande ligneCommande) {
		lignesCommande.add(ligneCommande);
	}

	public void remove(LigneCommande ligneCommande) {
		lignesCommande.remove(ligneCommande);
	}

	public void update(LigneCommande ligneCommande) {
		for (LigneCommande ligneCommand : lignesCommande) {
			if (ligneCommand.getId() == ligneCommande.getId()) {
				ligneCommand = ligneCommande;
			}
		}
	}

	public ArrayList<LigneCommande> findAll() {
		return lignesCommande;
	}

	public LigneCommande findById(int id) {
		for (int i = 0; i < lignesCommande.size(); i++) {
			LigneCommande findLigneComById = lignesCommande.get(i);
			if (id == findLigneComById.getId()) {
				return lignesCommande.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "LigneCommandeService [lignesCommande=" + lignesCommande + "]";
	}

}
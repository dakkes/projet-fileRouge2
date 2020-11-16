package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Vendeur;

public class VendeurService {

	private ArrayList<Vendeur> vendeurs;

	public VendeurService() {
		vendeurs = new ArrayList<Vendeur>();
	}

	public VendeurService(ArrayList<Vendeur> vendeurs) {
		super();
		this.vendeurs = vendeurs;
	}

	public ArrayList<Vendeur> getVendeurs() {
		return vendeurs;
	}

	public void setVendeurs(ArrayList<Vendeur> vendeurs) {
		this.vendeurs = vendeurs;
	}

	public void save(Vendeur vendeur) {
		vendeurs.add(vendeur);
	}

	public void remove(Vendeur vendeur) {
		vendeurs.remove(vendeur);
	}

	public void update(Vendeur vendeur) {
		for (Vendeur vende : vendeurs) {
			if (vende.getId() == vendeur.getId()) {
				vende = vendeur;
			}
		}
	}

	public ArrayList<Vendeur> findAll() {
		return vendeurs;
	}

	public Vendeur findById(int id) {
		for (int i = 0; i < vendeurs.size(); i++) {
			Vendeur findVendeurById = vendeurs.get(i);
			if (id == findVendeurById.getId()) {
				return vendeurs.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "VendeurService [vendeurs=" + vendeurs + "]";
	}

}
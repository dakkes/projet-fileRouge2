package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;

public class ProduitService {

	private ArrayList<Produit> produits;

	public ProduitService() {
		produits = new ArrayList<Produit>();
	}

	public ProduitService(ArrayList<Produit> produits) {
		super();
		this.produits = produits;
	}

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}

	public void save(Produit produit) {
		produits.add(produit);
	}

	public void remove(Produit produit) {
		produits.remove(produit);
	}

	public void update(Produit produit) {
		for (Produit produi : produits) {
			if (produi.getId() == produit.getId()) {
				produi = produit;
			}
		}
	}

	public ArrayList<Produit> findAll() {
		return produits;
	}

	public Produit findById(int id) {
		for (int i = 0; i < produits.size(); i++) {
			Produit findProduitById = produits.get(i);
			if (id == findProduitById.getId()) {
				return produits.get(i);
			}
		}
		return null;
	}

	public ArrayList<Produit> findByQuantiteEnStock() {
		ArrayList<Produit> disponibles = new ArrayList<>();
		for (Produit produit : produits) {
			if (produit.getQuantiteStock() > 0) {
				disponibles.add(produit);
			}
		}
		return disponibles;
	}

	@Override
	public String toString() {
		return "ProduitService [produits=" + produits + "]";
	}

}
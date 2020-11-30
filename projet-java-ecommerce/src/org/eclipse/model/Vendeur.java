package org.eclipse.model;

import java.util.Arrays;

public class Vendeur extends Utilisateur {

	private Produit[] produits;

	public Vendeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendeur(int id, String nom, String prenom, Adresse[] adresses, String adresseMail, String login,
			String numeroTelephone, String password) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendeur(Produit[] produits) {
		super();
		this.produits = produits;
	}

	public Produit[] getProduits() {
		return produits;
	}

	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Vendeur [produits=" + Arrays.toString(produits) + "]";
	}

	 

}
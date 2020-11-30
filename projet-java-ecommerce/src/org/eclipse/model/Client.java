package org.eclipse.model;

import java.util.Arrays;

public class Client extends Utilisateur {

	private Commande[] commande;
	private Panier panier;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String nom, String prenom, Adresse[] adresses, String adresseMail, String login,
			String numeroTelephone, String password) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Commande[] commande, Panier panier) {
		super();
		this.commande = commande;
		this.panier = panier;
	}
	public Commande[] getCommande() {
		return commande;
	}
	public void setCommande(Commande[] commande) {
		this.commande = commande;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	@Override
	public String toString() {
		return "Client [commande=" + Arrays.toString(commande) + ", panier=" + panier + "]";
	}
	
	
}
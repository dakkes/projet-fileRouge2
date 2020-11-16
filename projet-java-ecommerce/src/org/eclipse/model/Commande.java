package org.eclipse.model;

import java.util.Arrays;

public class Commande {
	private int id;
	private int dateCommande;
	private Client client;
	private LigneCommande [] lignesCommande;
	public Commande() {
		super() ;
		
	}
	public Commande(int id, int dateCommande, Client client, LigneCommande[] lignesCommande) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.client = client;
		this.lignesCommande = lignesCommande;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(int dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public LigneCommande[] getLignesCommande() {
		return lignesCommande;
	}
	public void setLignesCommande(LigneCommande[] lignesCommande) {
		this.lignesCommande = lignesCommande;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", client=" + client + ", lignesCommande="
				+ Arrays.toString(lignesCommande) + "]";
	}
	
}
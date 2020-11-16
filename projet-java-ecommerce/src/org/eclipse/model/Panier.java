package org.eclipse.model;

import java.util.Arrays;

 

public class Panier {
	private int id;
	private Client client;
	private ListeProduit[] listeProduit;

	public Panier(int id, Client client, ListeProduit[] listeProduit) {
		super();
		this.id = id;
		this.client = client;
		this.listeProduit = listeProduit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ListeProduit[] getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(ListeProduit[] listeProduit) {
		this.listeProduit = listeProduit;
	}

	@Override
	public String toString() {
		return "Panier [id=" + id + ", client=" + client + ", listeProduit=" + Arrays.toString(listeProduit) + "]";
	}

}

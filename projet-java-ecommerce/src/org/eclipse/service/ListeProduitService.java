package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.ListeProduit;

public class ListeProduitService {

	private ArrayList<ListeProduit> listeProduits;

	public ListeProduitService() {
		listeProduits = new ArrayList<ListeProduit>();
	}

	public ListeProduitService(ArrayList<ListeProduit> listeProduits) {
		super();
		this.listeProduits = listeProduits;
	}

	public ArrayList<ListeProduit> getListeProduits() {
		return listeProduits;
	}

	public void setListeProduits(ArrayList<ListeProduit> listeProduits) {
		this.listeProduits = listeProduits;
	}

	public void save(ListeProduit listeProduit) {
		listeProduits.add(listeProduit);
	}

	public void remove(ListeProduit listeProduit) {
		listeProduits.remove(listeProduit);
	}

	public void update(ListeProduit listeProduit) {
		for (ListeProduit listeProdui : listeProduits) {
			if (listeProdui.getId() == listeProduit.getId()) {
				listeProdui = listeProduit;
			}
		}
	}

	public ArrayList<ListeProduit> findAll() {
		return listeProduits;
	}

	public ListeProduit findById(int id) {
		for (int i = 0; i < listeProduits.size(); i++) {
			ListeProduit findListeProduitById = listeProduits.get(i);
			if (id == findListeProduitById.getId()) {
				return listeProduits.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ListeProduitService [listeProduits=" + listeProduits + "]";
	}

}
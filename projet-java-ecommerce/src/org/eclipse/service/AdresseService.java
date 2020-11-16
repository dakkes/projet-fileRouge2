package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Adresse;

 //methodes****


public class AdresseService {

	private ArrayList<Adresse> adresses;

	public AdresseService() {
		adresses = new ArrayList<Adresse>();
	}

	public AdresseService(ArrayList<Adresse> adresses) {
		super();
		this.adresses = adresses;
	}

	public ArrayList<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(ArrayList<Adresse> adresses) {
		this.adresses = adresses;
	}

	public void save(Adresse adresse) {
		adresses.add(adresse);
	}

	public void remove(Adresse adresse) {
		adresses.remove(adresse);
	}

	public void update(Adresse adresse) {
		for (Adresse adress : adresses) {
			if (adress.getId() == adresse.getId()) {
				adress = adresse;
			}
		}
	}

	public ArrayList<Adresse> findAll() {
		return adresses;
	}

	public Adresse findById(int id) {
		for (int i = 0; i < adresses.size(); i++) {
			Adresse findAdresseById = adresses.get(i);
			if (id == findAdresseById.getId()) {
				return adresses.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "AdresseService [adresses=" + adresses + "]";
	}

}
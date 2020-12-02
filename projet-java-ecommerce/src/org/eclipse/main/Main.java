package org.eclipse.main;

import org.eclipse.model.Adresse;
import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;
import org.eclipse.service.AdresseService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresse;
		adresse=new Adresse(12,"rue des ibisoirs", "nice", "France");
		 
		System.out.println(adresse);
		
		
		Adresse adresses;
		adresses=new Adresse(31,"rue des poiriers", "nice", "France");
		 
		System.out.println(adresses);
		
		
		 Utilisateur utilisateur;
		 utilisateur=new Utilisateur(12, "Mc bride","dylan","client");
		 
		 System.out.println(utilisateur);
		 
		 Utilisateur utilisateurs;
		 utilisateurs=new Utilisateur(13, "Stephenson","bryan","vendeur");
		 
		 System.out.println(utilisateurs);
		 
		 Produit produits;
		 produits=new Produit(15, "Ordinateur Asus", 25, 25, "lespc.com", null);
		
		 System.out.println(produits);
		 
		 AdresseService adresseService;
		 adresseService=new AdresseService();
		 
		 System.out.println(adresseService.findById(12));
		
		
		
	}

}

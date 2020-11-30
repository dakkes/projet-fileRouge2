package org.eclipse.service;

 
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.eclipse.model.ListeProduit;
import org.eclipse.model.Produit;

 
public class ProduitService {

	 List<Produit>produits=new ArrayList<>();
	 ListeProduit listeProduit1,listeProduit2,listeProduit3,listeProduit4;
	 
public ProduitService() {
	
	
produits.add(new Produit(1,"ASUS vivobook",9, 455,"https://www.cdiscount.com/pdt2/5/2/t/1/700x700/tp412faec452t/rw/pc-portable-asus-vivobook-flip-tactile-tp412fa-ec4.jpg",true,new ListeProduit()));
produits.add(new Produit(2,"ASUS zenbook",9, 999,"https://www.cdiscount.com/pdt2/9/9/t/1/300x300/ux481fabm099t/rw/pc-portable-asus-zenbook-duo-ux481fa-bm099t-14-f.jpg",true,new ListeProduit()));	 
produits.add(new Produit(3,"ASUS Gamer",7,749,"https://www.cdiscount.com/pdt2/5/2/t/1/700x700/tp412faec452t/rw/pc-portable-asus-vivobook-flip-tactile-tp412fa-ec4.jpg",true,new ListeProduit()));	 
produits.add(new Produit(4,"ASUS Zenbook",9, 929,"https://www.cdiscount.com/pdt2/7/5/t/1/300x300/ux431faam175t/rw/pc-portable-asus-zenbook-ux431fa-am175t-14-fhd.jpg",true,new ListeProduit()));	 
}

public void saveProduct(Produit produit){
	produits.add(produit);
}

public void remove(Produit produit){
	produits.add(produit);
}
}
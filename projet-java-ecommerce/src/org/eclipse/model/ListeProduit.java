package org.eclipse.model;

public class ListeProduit {
	private int id;
	private int quantite;
	private Panier panier;
	private Produit produit;
	private int category;
	public ListeProduit() {
		super();
		 
	}
	public ListeProduit(int id, int quantite, Panier panier, Produit produit, int category) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.panier = panier;
		this.produit = produit;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ListeProduit [id=" + id + ", quantite=" + quantite + ", panier=" + panier + ", produit=" + produit
				+ ", category=" + category + "]";
	}
	
	 
}
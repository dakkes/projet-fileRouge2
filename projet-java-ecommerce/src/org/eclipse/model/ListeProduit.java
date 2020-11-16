package org.eclipse.model;

public class ListeProduit {
	private int id;
	private int quantite;
	private Panier panier;
	private Produit produit;

	public ListeProduit(int id, int quantite, Panier panier, Produit produit) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.panier = panier;
		this.produit = produit;
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

	@Override
	public String toString() {
		return "ListeProduit [id=" + id + ", quantite=" + quantite + ", panier=" + panier + ", produit=" + produit
				+ "]";
	}

}
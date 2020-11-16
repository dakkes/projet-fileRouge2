package org.eclipse.model;

public class LignePanier {
	private int idLignePanier;
	private int quantiteCommander;
	private Panier panier;
	private Produit produit;

	public LignePanier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LignePanier(int quantiteCommander, int idLignePanier, Panier panier, Produit produit) {
		super();
		this.quantiteCommander = quantiteCommander;
		this.idLignePanier = idLignePanier;
		this.panier = panier;
		this.produit = produit;
	}
	
	

	public int getIdLignePanier() {
		return idLignePanier;
	}

	public void setIdLignePanier(int idLignePanier) {
		this.idLignePanier = idLignePanier;
	}

	public int getQuantiteCommander() {
		return quantiteCommander;
	}

	public void setQuantiteCommander(int quantiteCommander) {
		this.quantiteCommander = quantiteCommander;
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
		return "LignePanier [quantiteCommander=" + quantiteCommander + ", idLignePanier=" + idLignePanier + ", panier=" + panier
				+ ", produit=" + produit + "]";
	}

}

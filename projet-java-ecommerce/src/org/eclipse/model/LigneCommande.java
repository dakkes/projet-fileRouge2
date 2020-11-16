package org.eclipse.model;

public class LigneCommande {

	private int id;
	private int quantiteCommander;
	private Produit produit;
	private Commande commande;

	public LigneCommande(int id, int quantiteCommander, Produit produit, Commande commande) {
		super();
		this.id = id;
		this.quantiteCommander = quantiteCommander;
		this.produit = produit;
		this.commande = commande;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantiteCommander() {
		return quantiteCommander;
	}

	public void setQuantiteCommander(int quantiteCommander) {
		this.quantiteCommander = quantiteCommander;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", quantiteCommander=" + quantiteCommander + ", produit=" + produit
				+ ", commande=" + commande + "]";
	}

}

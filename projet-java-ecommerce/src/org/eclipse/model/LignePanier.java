package org.eclipse.model;

public class LignePanier {
	private int id;
	private int quantite;
	private int idProduit;
	private int idPanier;
	private double prixUnitaire;
	public LignePanier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LignePanier(int id, int quantite, int idProduit, int idPanier, double prixUnitaire) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.idProduit = idProduit;
		this.idPanier = idPanier;
		this.prixUnitaire = prixUnitaire;
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
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	@Override
	public String toString() {
		return "LignePanier [id=" + id + ", quantite=" + quantite + ", idProduit=" + idProduit + ", idPanier="
				+ idPanier + ", prixUnitaire=" + prixUnitaire + "]";
	}
   
	
	
}

package org.eclipse.model;

 

public class Produit {

	private int id;
	private String designation;
	private float prixUnitaire;
	private int quantiteStock;
	private String urlImage;
	private String nomArticle;
	
	
	
	public Produit() {
		super();
	}
	public Produit(String designation, float prixUnitaire, int quantiteStock, String urlImage, String nomArticle) {
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
		this.urlImage = urlImage;
		this.nomArticle = nomArticle;
	}
	public Produit(int id, String designation, float prixUnitaire, int quantiteStock, String urlImage,
			String nomArticle) {
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
		this.urlImage = urlImage;
		this.nomArticle = nomArticle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getQuantiteStock() {
		return quantiteStock;
	}
	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", quantiteStock=" + quantiteStock + ", urlImage=" + urlImage + ", nomArticle=" + nomArticle
				+ "]";
	}
	 
	
	
	
	
	
}
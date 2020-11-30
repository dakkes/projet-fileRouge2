package org.eclipse.model;

 

public class Produit {

	private int id;
	private String nomArticle;
	private int quantiteStock;
	private String designation;
	private float prixUnitaire;
	private String urlImage;
	private boolean choix;
	private ListeProduit listeProduit;
	public Produit() {
		listeProduit=new ListeProduit();
	}
	public Produit(int id, String nomArticle, int quantiteStock, float prixUnitaire, String urlImage, boolean choix,
			ListeProduit listeProduit) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.quantiteStock = quantiteStock;
		this.prixUnitaire = prixUnitaire;
		this.urlImage = urlImage;
		this.choix = choix;
		this.listeProduit = listeProduit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public int getQuantiteStock() {
		return quantiteStock;
	}
	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
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
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public boolean isChoix() {
		return choix;
	}
	public void setChoix(boolean choix) {
		this.choix = choix;
	}
	public ListeProduit getListeProduit() {
		return listeProduit;
	}
	public void setListeProduit(ListeProduit listeProduit) {
		this.listeProduit = listeProduit;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nomArticle=" + nomArticle + ", quantiteStock=" + quantiteStock
				+ ", designation=" + designation + ", prixUnitaire=" + prixUnitaire + ", urlImage=" + urlImage
				+ ", choix=" + choix + ", listeProduit=" + listeProduit + "]";
	}
	
	
	
	
	
}
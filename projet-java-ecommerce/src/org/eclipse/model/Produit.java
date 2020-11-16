package org.eclipse.model;

public class Produit {

	private int id;
	private int nomArticle;
	private int quantiteStock;
	private String categorie;
	private String designation;
	private double prixUnitaire;
	private String image;
	private String url;

	public Produit(int id, int nomArticle, int quantiteStock, String categorie, String designation, double prixUnitaire,
			String image, String url) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.quantiteStock = quantiteStock;
		this.categorie = categorie;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.image = image;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(int nomArticle) {
		this.nomArticle = nomArticle;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nomArticle=" + nomArticle + ", quantiteStock=" + quantiteStock + ", categorie="
				+ categorie + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire + ", image=" + image
				+ ", url=" + url + "]";
	}

}
package org.eclipse.model;



//class de definition 
public class Adresse {

//variable globale Attributs
	
	private int id;
	private String rue;
	private String ville;
	private String pays;
	 
	//constructeur 
	
	public Adresse(int id, String rue, String ville, String pays) {
		super();
		//Le mot clé super est utilisé afin d'appeler
		//les méthodes de la classe parente.
		this.id = id;
		//objet dynamiquement actif.
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
	}
	
	//getter/setter qui associent une action chaques fois qu'ils sont appelés.
	//le setter permet de demander un changement d'état. 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	//permet de donner un aperçut d'un objet instancié
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", ville=" + ville + ", pays=" + pays + "]";
	}

	 
}
package org.eclipse.model;


//class de definition 
public class Adresse {

	private int id;
	private String rue;
	private String ville;
	private String pays;
	 
	public Adresse(int id, String rue, String ville, String pays) {
		super();
		this.id = id;
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
	}
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
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", ville=" + ville + ", pays=" + pays + "]";
	}

	 
}
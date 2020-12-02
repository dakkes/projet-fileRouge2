package org.eclipse.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.config.MyConnection;
 
import org.eclipse.model.Produit;
import org.eclipse.model.Produit;

public class ProduitDao implements Dao<Produit> {
	
	@Override
	public Produit save(Produit produit) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into produit (Designation,quantiteStock,prixUnitaire,urlImage) values (?,?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, produit.getDesignation());
				ps.setInt(2, produit.getQuantiteStock());
				ps.setFloat(3, produit.getPrixUnitaire());
				ps.setString(4, produit.getUrlImage());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					produit.setId(resultat.getInt(1));
					return produit;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	@Override
	public void remove(Produit produit) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM  produit  WHERE id = ? ; ");
				ps.setInt(1, produit.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Produit update(Produit produit) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE  produit SET Designation=? , type=? WHERE id=? ; ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, produit.getDesignation());
				ps.setInt(2, produit.getQuantiteStock());
				ps.setFloat(3, produit.getPrixUnitaire());
				ps.setString(4, produit.getUrlImage());
				int nbr = ps.executeUpdate();
				if (nbr != 0) {
					return produit;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Produit findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Produit WHERE id = ?;");
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					 
					String Designation = result.getString(1);
					int QuantiteStock = result.getInt(2);
					float PrixUnitaire = result.getFloat(3);
					String UrlImage = result.getString(4);
					 
					Produit produit = new Produit(id,Designation,PrixUnitaire,QuantiteStock,UrlImage, null);
					return produit;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public List<Produit> findAll() {
		ArrayList<Produit> produits = new ArrayList<Produit>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Produit;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt(1);
					String Designation = result.getString(1);
					int QuantiteStock = result.getInt(2);
					float PrixUnitaire = result.getFloat(3);
					String UrlImage = result.getString(4);
					Produit produit = new Produit(id, Designation,PrixUnitaire, QuantiteStock,  UrlImage,null);
					produits.add(produit);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return produits;
	}

	 

	 

	 

}

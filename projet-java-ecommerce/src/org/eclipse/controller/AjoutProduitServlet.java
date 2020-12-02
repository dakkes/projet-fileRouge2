package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import org.eclipse.model.Produit;
 
import org.eclipse.service.ProduitService;

 
@WebServlet("/ajout")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProduitService produitService = new ProduitService();   
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit/add.jsp").forward(request, response);
	 
	}

	 
	 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String designation = request.getParameter("Designation");
		int quantiteStock = Integer.parseInt(request.getParameter("QuantiteStock"));
		float prixUnitaire = Float.parseFloat(request.getParameter("PrixUnitaire"));
		String urlImage =  request.getParameter("UrlImage");
		Produit produit = new Produit(designation,prixUnitaire, quantiteStock,urlImage, null);
		produitService.save(produit);
		doGet(request, response);
	}
}

package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Utilisateur;
import org.eclipse.service.UtilisateurService;

 
@WebServlet("/inscriptionVendeur")
public class InscriptionVendeurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vendeur/inscriptionVendeur.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		UtilisateurService utilisateurService = new UtilisateurService();
		Utilisateur utilisateur = utilisateurService.findByNomAndPrenom(nom, prenom);
		if (utilisateur == null) {
			response.sendRedirect( "pageVendeur");
		} else {
			 response.sendRedirect("home");
			 
		 
		
		
		 
	}

	}
}

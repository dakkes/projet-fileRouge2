package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		//this.getServletContext() permet de communiquer avec d’autres
		//composants (via le conteneur de Servlet).
		 //getRequestDispatcher("") : permet d’indiquer l’emplacement
		//de la vue et de la recuperer. 
		
		//forward(request, response):pour envoyer la requete et la reponse
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>projet-java-ecommerce</title>
</head>
<body>

	<h1 class="bg-secondary text-white">PAGE D'AUTHENTIFICATION VENDEUR</h1>

	<div class="progress">
		<div class="progress-bar" role="progressbar" style="width: 15%"
			aria-valuenow="15" aria-valuemin="0" aria-valuemax="100"></div>
		<div class="progress-bar bg-success" role="progressbar"
			style="width: 30%" aria-valuenow="30" aria-valuemin="0"
			aria-valuemax="100"></div>
		<div class="progress-bar bg-info" role="progressbar"
			style="width: 20%" aria-valuenow="20" aria-valuemin="0"
			aria-valuemax="100"></div>
	</div><br/>

	<form action="connexionVendeur" method="POST">
		<div>
			<label class="bg-primary text-red" for="nom">Nom
				d'utilisateur</label> <input type=text id=nom name=nom>
		</div>
		<div>
			<label class="bg-primary text-red" for="prenom">Mot de
				passe</label> <input type=password id=prenom name=prenom>
		</div>
		<button class="btn btn-primary">Se connecter</button>
	</form>
</body>
</html>
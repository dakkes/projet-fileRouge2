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
	<h1 class="bg-secondary text-white">FORMULAIRES</h1>
	<br />
	<div class="container">
		<h1>FORMULAIRE INSCRIPTION CLIENT</h1>
		<form class="needs-validation" novalidate>
			<div class="form-row">
				<div class="col-md-4 mb-3">
					<label for="prenom">Prénom</label> <input type="text"
						class="form-control" id="prenom" placeholder="prenom" required>
					<div class="valid-feedback">Ok !</div>
					<div class="invalid-feedback">Valeur incorrecte</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="nom">Nom</label> <input type="text"
						class="form-control" id="nom" placeholder="nom" required>
					<div class="valid-feedback">Ok !</div>
					<div class="invalid-feedback">Valeur incorrecte</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="password">Password</label> <input type="text"
						class="form-control" id="password" placeholder="p" required>
					<div class="valid-feedback">Ok !</div>
					<div class="invalid-feedback">Valeur incorrecte</div>
				</div>
			</div>
			<div class="form-row">
				<div class="col-md-6 mb-3">
					<label for="ville">Ville</label> <input type="text"
						class="form-control" id="ville" placeholder="Ville" required>
					<div class="valid-feedback">Ok !</div>
					<div class="invalid-feedback">Valeur incorrecte</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="pays">Pays</label> <input type="text"
						class="form-control" id="pays" placeholder="Pays" required>
					<div class="valid-feedback">Ok !</div>
					<div class="invalid-feedback">Valeur incorrecte</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="cp">Code postal</label> <input type="number"
						class="form-control" id="cp" placeholder="Code postal" required>
					<div class="valid-feedback">Ok !</div>
					<div class="invalid-feedback">Valeur incorrecte</div>
				</div>
			</div>

			<button class="btn btn-primary" type="submit">Envoyer</button>
		</form>
	</div>

</body>
</html>

</body>
</html>
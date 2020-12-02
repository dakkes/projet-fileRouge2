<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>produit</title>
</head>
<body>
	 <h1 class="bg-secondary text-white">AJOUT PRODUITS</h1>
	 
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
	
	<form action="ajout" method="POST">
		<div>
			<label class="bg-primary text-red" for="Designation">Designation
				</label> <input type=text id=Designation name=Designation>
		</div>
		<div>
			<label class="bg-primary text-red" for="QuantiteStock">QuantiteStock
				</label> <input type=QuantiteStock id=QuantiteStock name=QuantiteStock>
		</div>
		<div>
			<label class="bg-primary text-red" for="PrixUnitaire">PrixUnitaire
				</label> <input type=PrixUnitaire id=PrixUnitaire name=PrixUnitaire>
		</div>
		<div>
			<label class="bg-primary text-red" for="UrlImage">Image
				</label> <input type=UrlImage id=UrlImage name=UrlImage>
		</div>
		<button class="btn btn-primary">Cliquer Ici</button>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link
	href="https://fonts.googleapis.com/css?family=Crete+Round&display=swap"
	rel="stylesheet">

<title>projet-java-ecommerce</title>
</head>
<body>

	<div class="container-fluid">
		<h1>HIGH TECH</h1>
		<header>
			<nav class="navbar navbar-expand-md navbar-dark bg-dark">
				<a class="navbar-brand" href="connexion">Identification</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="produit" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false" role="button">Produits</a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="#"></a> <a class="dropdown-item"
									href="#"></a> <a class="dropdown-item" href="#"></a>
							</div></li>
						<li class="nav-item"><a class="nav-link " href="connexion">Client</a></li>
						<li class="nav-item"><a class="nav-link "
							href="connexionVendeur">Vendeur</a></li>
					</ul>
					<form class="form-inline">
						<input class="form-control mr-sm-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-info my-2 my-sm-0" type="submit">Search</button>
					</form>
				</div>
	
	</nav>
	</header>
	<section id="main-image">
		<!--  <img
			src="https://blog.sensefuel.com/hubfs/Pour%20Blog%20%28illustrations%20et%20photos%29/intelligence-artificielle-ecommerce-1.jpg"
			alt="images ordi">
			-->
	</section>
	</div>
	<section id="steps">
		<div class="wrapper">
			<ul>
				<li id="step-1">
					<h5><a href="inscription">Inscription Client</a></h5>
					<p>Identifier votre produit qui seras garantie.</p>
				</li>
				<li id="step-2">
					 <h5><a href="inscriptionVendeur">Inscription Vendeur</a></h5>
					<p>Proposer vos produits et nous nous occupons de tous.</p>
				</li>
			</ul>
		</div>
	</section>
	  <footer>
        <div class="wrapper"></div>
        <h1>HIGH TECH<span class="orange">.</span></h1>
        <div class="copyright">copyright €2020.tous droits réservés.</div>
    </div>
</footer>


</body>
</html>
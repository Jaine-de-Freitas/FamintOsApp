<!DOCTYPE html>
<html lang="pt_br">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">	
	<title>Cadastro - FamintOs</title>

	<!--CSS-->
	<link rel="stylesheet" href="../css/cardapio.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!--ICON-->
	<link rel="icon" href="../estetica_imgs/favicon.ico">
</head>
<body>
	
<?php
	include 'conexao.php';	
	include 'header.php';
?>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4">
				
				<h2>Cadastro de novo Cliente</h2>
				
				<form method="post" action="inserirusuario.php" name="logon"> <!-- abrindo formulario -->
				
				<div class="form-group">
					<label for="nome">Nome</label>
					<input name="nome_cad" type="text" class="form-control" required="required">
				</div>

				<div class="form-group">
					<label for="email">E-mail</label>
					<input name="email_cad" type="email" class="form-control" required="required">
				</div>
					
				<div class="form-group">
					<label for="senha">Senha</label>
					<input name="senha_cad" type="password" class="form-control" required="required">
				</div>
							
				<button type="submit" class="btn btn-lg btn-default">	
					<span class="glyphicon glyphicon-pencil"> Cadastrar</span>	
				</button>

				<button type="submit" class="btn btn-lg btn-link">
						<a href="login.php">
							Já sou cadastrado
						</a>
				</button>

				
				</form> <!-- fechando formulario -->
							
			</div>
		</div>
	</div>
	
<?php 
	include 'footer.php' 
?>

</body>
</html>
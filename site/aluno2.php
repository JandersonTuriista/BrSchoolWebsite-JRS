<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="_css/estilo.css"/>
  <meta charset="UTF-8"/>
  <title>Curso de PHP - CursoemVideo.com</title>
</head>
<body>
<div>
    <?php
		$nome= $_GET["nome"];
		$matri= $_GET["matri"];
		$serie= $_GET["serie"];
		header("Location: http://localhost/projects/jrs/jrs.html");
    ?>
	<a href="aluno.php">Voltar</a>
</div>
</body>
</html>
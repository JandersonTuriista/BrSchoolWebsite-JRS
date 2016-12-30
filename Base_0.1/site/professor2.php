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
       $n= $_GET["n"];
	   $s= $_GET["s"];
	   switch($s){
			case "professor":
			 header("Location: http://localhost/projects/jrs/jrs.html");
			 break;
			default: 
			 echo "Senha incorreta";
	   }
    ?>
	<a href="professor.php">Voltar</a>
</div>
</body>
</html>
 
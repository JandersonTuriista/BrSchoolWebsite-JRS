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
		$p= $_GET["login"];
		switch($p){
			case 1:
			 header("Location: http://localhost/projects/site/aluno.php");
			 break;
			case 2:
			 header("Location: http://localhost/projects/site/professor.php");
			 break;
			default: 
			 header("Location: http://localhost/projects/jrs/jrs.html");	
		}
    ?>
</div>
</body>
</html>
 
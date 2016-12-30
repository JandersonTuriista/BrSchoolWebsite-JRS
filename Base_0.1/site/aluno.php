<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="_css/estilo.css"/>
    <meta charset="UTF-8"/>
    <title>Curso de PHP - CursoemVideo.com</title>
</head>
<body>
<div>
	<form method="get" action="aluno2.php">
		Nome: <input type="tex" name="nome" placeholder="Qual o seu nome?" min="13" max="100"/>
		</br>Matricula: <input type="number" name="matri" placeholder="Qual o número da dua matrícula?"/>
		</br><input type="radio" name="serie" id="1º ano" value="1" checked/>
		<label for="1º ano">1º ano</label>
		<input type="radio" name="serie" id="matri" value="2"/>
		<label for="2º ano">2º ano</label>
		<input type="radio" name="serie" id="3º ano" value="3"/>
		<label for="3º ano">3º ano</label>
		</br><input type="submit" value="Entrar"/>
	</form>
</div>
</body>
</html>
 
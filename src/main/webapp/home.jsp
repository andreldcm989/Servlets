<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="produtos/lista" var="listarProdutos"/>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Home | Minha Loja</title>
</head>
<body>
	<h2>Bem-vindo!!</h2>

	<section class="home-container">
		<a href="${ listarProdutos }">
			<input type="button" class="home-card" value="Listar Produtos"/>
		</a>
		<a href="CadastrarProduto.jsp">
			<input type="button" class="home-card" value="Cadastrar Produtos"/>
		</a>
	</section>
</body>
</html>
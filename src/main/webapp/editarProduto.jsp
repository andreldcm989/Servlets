<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="produtos/novo" var="criarProdutoServlet" />
<c:url value="lista" var="listarProdutos"/>
<c:url value="/home.jsp" var="home"/>
<c:url value="/styles.css" var="css"/>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="${ css }">
<title>Editar | Minha Loja</title>
</head>
<body>
	<h2 class="lista-titulo">Editar Produto</h2>
	<nav class="lista-navbar">
		<a href="${ home }"> <input type="button" value="Home">
		</a> <a href="${ listarProdutos }"> <input type="button"
			value="Listar Produto">
		</a>
	</nav>

	<div class="cadastro-container">
		<h3>Preencha os campos abaixo:</h3>
		<form action="${ criarProdutoServlet }" method="post">
			<div class="cadastro-input">
				<label for="nome">Id: </label> <input type="text"
					name="nome" value="${ produto.id }" disabled>
			</div>
			<div class="cadastro-input">
				<label for="nome">Nome Produto: </label> <input type="text"
					name="nome" value="${ produto.nome }" required>
			</div>
			<div class="cadastro-input">
				<label for="marca">Marca: </label> <input type="text" name="marca"
					value="${ produto.marca }" required>
			</div>
			<div class="cadastro-input">
				<label for="valor">Pre�o (R$): </label> <input type="number"
					name="valor" step="0.01" value="${ produto.valor }" required>
			</div>
			<div class="cadastro-input">
				<label for="quantidade">Quantidade: </label> <input type="number"
					name="quantidade" min="1" value="${ produto.quantidade }" required>
			</div>
			<div class="cadastro-input">
				<input class="button" type="submit" value="Salvar">
				<input class="button" type="reset" value="Cancelar" >
			</div>
		</form>
	</div>
</body>
</html>
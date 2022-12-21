<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="br.com.minhaloja.model.Produto"%>

<c:url value="/home.jsp" var="home" />
<c:url value="/CadastrarProduto.jsp" var="cadastro" />

<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/minhaloja/styles.css" />
<title>Produtos | Minha Loja</title>
</head>
<body>
	<h2 class="lista-titulo">Lista de Produtos</h2>
	<nav class="lista-navbar">
		<a href="${ home }"> <input type="button" value="Home">
		</a> <a href="${ cadastro }"> <input type="button"
			value="Novo Produto">
		</a>
	</nav>
	<c:if test="${ not empty produtos }">
		<fmt:setLocale value="pt_BR" />
		<table class="lista-table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Produto</th>
					<th>Marca</th>
					<th>Valor</th>
					<th>Quantidade</th>
					<th>Total Estoque</th>
					<th>Criado em</th>
					<th colspan="2">Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ produtos }" var="produto">
					<tr>
						<td>${ produto.id }</td>
						<td>${ produto.nome }</td>
						<td>${ produto.marca }</td>
						<td><fmt:formatNumber value="${ produto.valor }"
								type="currency" /></td>
						<td>${ produto.quantidade }</td>
						<td><fmt:formatNumber value="${ produto.total }" type="currency"/></td>
						<td><fmt:formatDate value="${ produto.dataCriacao }"
								pattern="dd/MM/yyyy HH:mm" /></td>
						<td><a href="editar?id=1"> <input type="button"
								value="Editar">
						</a></td>
						<td><a href="excluir?id=1"> <input type="button"
								value="Excluir">
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	<c:if test="${ empty produtos }">
		<h3>Nenhum produto cadastrado! :(</h3>
	</c:if>

</body>
</html>
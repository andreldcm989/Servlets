<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="br.com.minhaloja.model.Produto"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css" />
<title>Produtos | Minha Loja</title>
</head>
<body>
	<h2 class="lista-titulo">Lista de Produtos</h2>
	<nav class="lista-navbar">
		<a href="home.jsp">
			<input type="button" value="Home">
		</a>
		<a href="#">
			<input type="button" value="Novo Produto">
		</a>
	</nav>
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
				<th>Modificado em</th>
				<th colspan="2">Ações</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>A71</td>
				<td>Samsung</td>
				<td>1899,90</td>
				<td>10</td>
				<td>18999,00</td>
				<td>21/12/2022 02:18</td>
				<td>21/12/2022 02:19</td>
				<td><a href="editar?id=1"> <input type="button"
						value="Editar">
				</a></td>
				<td><a href="excluir?id=1"> <input type="button"
						value="Excluir">
				</a></td>
			</tr>
		</tbody>
	</table>

</body>
</html>
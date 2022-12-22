package br.com.minhaloja.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.minhaloja.model.Produto;

@WebServlet("/produtos/atualizar")
public class EditaProdutoServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("minhaloja");
		EntityManager em = factory.createEntityManager();
		System.out.println(request.getParameter("id"));
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, Integer.parseInt(request.getParameter("id")));
		produto.setMarca(request.getParameter("marca"));
		produto.setNome(request.getParameter("nome"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
		produto.setTotal();
		em.getTransaction().commit();
		em.close();
		
		response.sendRedirect("lista");
	}
}

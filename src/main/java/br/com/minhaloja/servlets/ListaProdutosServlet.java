package br.com.minhaloja.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.minhaloja.model.Produto;

@WebServlet(urlPatterns = "/produtos/lista")
public class ListaProdutosServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("minhaloja");
		EntityManager em = factory.createEntityManager();
		String query = "SELECT p FROM Produto p";
		List<Produto> produtos = em.createQuery(query, Produto.class).getResultList();
		req.setAttribute("produtos", produtos);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/listarProdutos.jsp");
		dispatcher.forward(req, resp);
	}
}


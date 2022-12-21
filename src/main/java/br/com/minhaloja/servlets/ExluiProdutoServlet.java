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

@WebServlet(urlPatterns = "/produtos/excluir")
public class ExluiProdutoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("minhaloja");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class, Integer.parseInt(req.getParameter("id")));
		em.remove(produto);
		em.getTransaction().commit();
		em.close();
		System.out.println("produto excluido com sucesso!");
		resp.sendRedirect("lista");
	}

}

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

@WebServlet(urlPatterns = "/produtos/novo")
public class CriarProdutoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String marca = req.getParameter("marca");
		double valor = Double.parseDouble(req.getParameter("valor"));
		int quantidade = Integer.parseInt(req.getParameter("quantidade"));
		Produto p = new Produto(nome, marca, valor, quantidade);
		System.out.println(p.toString());
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("minhaloja");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		resp.sendRedirect("/minhaloja/listarProdutos.jsp");
	}
}

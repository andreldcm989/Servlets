package br.com.minhaloja.servlets;

import java.io.IOException;

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
import br.com.minhaloja.model.dao.ProdutoDAO;

@WebServlet(urlPatterns = "/produtos/editar")
public class BuscaProdutoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoDAO dao = ProdutoDAO.getInstance("minhaloja");
		Produto produto = dao.buscarProdutoPorId(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("produto", produto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/editarProduto.jsp");
		dispatcher.forward(req, resp);
	}
}

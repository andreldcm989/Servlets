package br.com.minhaloja.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.minhaloja.model.Produto;
import br.com.minhaloja.util.JPAUtil;

public class ProdutoDAO {
	
	private static ProdutoDAO dao;
	private EntityManager em;
	
	private ProdutoDAO(String database) {
		this.em = JPAUtil.getEntityManager(database);
	}
	
	public static synchronized ProdutoDAO getInstance(String database) {
		if(dao == null) {
			dao = new ProdutoDAO(database);
		}
		return dao;
	}
	
	public List<Produto> listarProdutos(){
		String query = "SELECT p FROM Produto p";
		return em.createQuery(query, Produto.class).getResultList();
	}
	
	public Produto buscarProdutoPorId(int id) {
		return em.find(Produto.class, id);
	}
	
	public void fechaEntityManager() {
		em.close();
	}

}

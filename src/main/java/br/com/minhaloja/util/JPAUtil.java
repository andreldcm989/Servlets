package br.com.minhaloja.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {
	
	public static EntityManager getEntityManager(String database) {
		return Persistence.createEntityManagerFactory(database).createEntityManager();
	}
}

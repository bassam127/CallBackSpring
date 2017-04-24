package com.bassam.callBack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("callback.jpa");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Article article = new Article("New generation");
		
		entitymanager.persist(article);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entityManagerFactory.close();
	}

}

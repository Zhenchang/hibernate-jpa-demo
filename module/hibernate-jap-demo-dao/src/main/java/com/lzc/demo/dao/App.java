package com.lzc.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.lzc.hibernate.demo.core.model.People;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		People people = new People();
		people.setPid("001");
		people.setName("Jon Smith");
		people.setEmail("JonSmith@gmail.com");
		em.persist(people);
		em.getTransaction().commit();
		em.close();
	}
}

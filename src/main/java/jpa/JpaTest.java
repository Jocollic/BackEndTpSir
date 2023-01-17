package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import jpa.classMetier.Ticket;
import jpa.classMetier.User;

public class JpaTest {
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory =   
 			 Persistence.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		test.listUsers();
			
   	 manager.close();
		System.out.println(".. done");
	}



	private void createUsers() {
		int numOfUsers = manager.createQuery("Select a From Users a", User.class).getResultList().size();
		if (numOfUsers == 0) {
			Ticket ticket = new Ticket();
			manager.persist(ticket);

			manager.persist(new User("Jakab Gipsz"));
			manager.persist(new User("Captain Nemo"));

		}
	}

	private void listUsers() {
		List<User> resultList = manager.createQuery("Select a From Employee a", User.class).getResultList();
		System.out.println("num of Users:" + resultList.size());
		for (User next : resultList) {
			System.out.println("next user: " + next);
		}
	}
}


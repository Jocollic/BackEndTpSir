package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
 		Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();

		tx.begin();
		
		try {
			test.createUsers();
			test.createTickets();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		test.listUsers();
		test.listTickets();
			
   	 manager.close();
		System.out.println(".. done");
	}



	private void createUsers() {
		int numOfUsers = manager.createQuery("Select a From User a", User.class).getResultList().size();
		if (numOfUsers == 0) {
			User user = new User();
			manager.persist(user);

			manager.persist(new User("Jakab Gipsz"));
			manager.persist(new User("Captain Nemo"));

		}
	}

	private void listUsers() {
		List<User> resultList = manager.createQuery("Select a From User a", User.class).getResultList();
		System.out.println("num of Users:" + resultList.size());
		for (User next : resultList) {
			System.out.println("next user: " + next);
		}
	}

	private void createTickets() {
		int numOfTickets = manager.createQuery("Select a From Ticket a", Ticket.class).getResultList().size();
		if (numOfTickets == 0) {
			User user = new User("JC");
			manager.persist(user);

			manager.persist(new Ticket("Salut",user));
			manager.persist(new Ticket("Captain Nemo",user));

		}
	}

	private void listTickets() {
		List<Ticket> resultList = manager.createQuery("Select a From Ticket a", Ticket.class).getResultList();
		System.out.println("num of Tickets:" + resultList.size());
		for (Ticket next : resultList) {
			System.out.println("next Ticket: " + next);
		}
	}

	private void critera() {
		
	}
}


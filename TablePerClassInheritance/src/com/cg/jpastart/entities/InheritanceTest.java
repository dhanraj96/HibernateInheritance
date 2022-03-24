package com.cg.jpastart.entities;

import javax.persistence.EntityManager;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManager factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//Create one employee
	Employee employee = new Employee();
	employee.setName("Dhanraj");
	employee.setSalary(500000);
	em.persist(employee);
	
	
	//Create one manager
	Manager manager = new Manager();
	manager.setName("Onkar");
	manager.setSalary(2000000);
	manager.setDepertmentName("Technical");
	em.persist(manager);
	
	em.getTransaction().commit();
	
	System.out.println("Added one employee and manager to database.");
	em.close();
	factory.close();
	

	}

}



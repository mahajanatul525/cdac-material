package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("proj1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		Student s1=new Student();
		s1.setName("sachin");
		s1.setAge(20);
		trans.begin();
		em.persist(s1);
		trans.commit();
		System.out.println("done");
	}

}

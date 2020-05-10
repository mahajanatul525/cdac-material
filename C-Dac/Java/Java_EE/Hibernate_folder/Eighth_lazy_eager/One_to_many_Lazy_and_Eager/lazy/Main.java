package mypack;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        try { 
            transaction = session.beginTransaction(); 
           Student s1=new Student();
           Phone p1=new Phone();
           p1.setPhoneNumber("9270682272");
           p1.setPhoneType("mobile");
           Phone p2=new Phone();
           p2.setPhoneNumber("2500727");
           p2.setPhoneType("resd");
           HashSet<Phone> h=new HashSet<Phone>();
           h.add(p1);
           h.add(p2);
           s1.setStudentName("abc");
           s1.setStudentPhoneNumbers(h);
           session.save(s1);
           transaction.commit(); 
           session.close();
           session=HibernateUtil.getSessionFactory().openSession();
           Student ref=(Student)session.get(Student.class,new Long(1));
           session.close();       
           System.out.println(ref.getStudentId());
           System.out.println(ref.getStudentName());
           System.out.println(ref.getStudentPhoneNumbers());
            System.out.println("done with student");  
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}







}
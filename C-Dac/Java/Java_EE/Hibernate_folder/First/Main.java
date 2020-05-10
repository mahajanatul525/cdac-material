package mypack;

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
            Product p=new Product();
            p.setId(1);
            p.setName("soap");
            p.setQty(75);
            p.setPrice(90);

	     session.save(p);
		transaction.commit();
         
          
         
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}





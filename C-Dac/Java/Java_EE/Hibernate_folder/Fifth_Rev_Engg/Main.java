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
            Dept d=new Dept();
            d.setDeptno(5);
            d.setDname("Training");
            d.setLoc("Kashmir");
            session.save(d);
            transaction.commit(); 
            System.out.println("done with department");
          	}
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}
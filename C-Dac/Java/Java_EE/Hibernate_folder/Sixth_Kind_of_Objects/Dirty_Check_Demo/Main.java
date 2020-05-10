package mypack;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;
public class Main 
{
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        try { 
            transaction = session.beginTransaction(); 
            Product p=new Product();
            p.setName("soap");
            p.setQty(75);
            p.setPrice(90);
        
            session.save(p);      
            transaction.commit(); 
           
            Scanner sc=new Scanner(System.in);
            System.out.println(sc.nextInt()); // go and check in database

            transaction=session.beginTransaction();
            Product ref=(Product)session.get(Product.class,1);
            ref.setName("Baby Soap");
            transaction.commit();
            session.close();
            
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}





}
package mypack;

import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			AnnotationConfiguration cfg=new AnnotationConfiguration().configure("hibernate.cfg.xml");  
			SessionFactory factory=cfg.buildSessionFactory();  
			    
			Session session=factory.openSession();
			Product p=new Product();
			p.setName("soap");
			p.setPrice(100);
			p.setQty(30);
			Transaction trans=session.beginTransaction();
			session.save(p);
			trans.commit();
			session.close();
			    Session session1=factory.openSession();  
			    Product emp2=(Product)session1.load(Product.class,1);  
			    System.out.println(emp2);
			    Query q1=session1.createQuery("from Product k where k.id=1");
	            q1.setCacheable(true);
	          
	            List mylist=q1.list();
	            
	            System.out.println(mylist);
			    session1.close();  
			    
	            System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); 
	            System.out.println(factory.getStatistics().getQueryCacheHitCount()); 
	            Session session2=factory.openSession();  
			    Product emp3=(Product)session2.load(Product.class,1);  
			    System.out.println(emp3);
			    session2.close();
			    Session session3=factory.openSession();
			    Query q2=session3.createQuery("from Product k where k.id=1");
	            q2.setCacheable(true);
	          
	            mylist=q2.list();
	            
	            System.out.println(mylist);
			    session3.close();  
			    
	            System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); 
	            System.out.println(factory.getStatistics().getQueryCacheHitCount()); 
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}














}
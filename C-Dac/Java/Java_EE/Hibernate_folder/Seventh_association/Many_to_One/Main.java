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
            Employer employer = new Employer();  
            employer.setEmployerName("Principal");  
              
            Employee employee1 = new Employee();  
            employee1.setEmployeeName("Abc");  
            employee1.setEmployer(employer);  
              
            Employee employee2 = new Employee();  
            employee2.setEmployeeName("Xyz");  
            employee2.setEmployer(employer);  
              
            session.save(employee1);    
            session.save(employee2);  
            transaction.commit();
            session.close();
            }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}

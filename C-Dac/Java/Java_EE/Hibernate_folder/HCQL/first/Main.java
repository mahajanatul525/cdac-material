package mypack;
import org.hibernate.Criteria;
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
          
              
           Employee e1=new Employee();
           e1.setName("abc");
           e1.setDesig("accountant");
           e1.setSalary(25000);
          
           Employee e2=new Employee();
           e2.setName("xyz");
           e2.setDesig("manager");
           e2.setSalary(35000);
           
           Employee e3=new Employee();
           e3.setName("pqr");
           e3.setDesig("clerk");
           e3.setSalary(15000);
           
           Employee e4=new Employee();
           e4.setName("lmn");
           e4.setDesig("Soft_Engineer");
           e4.setSalary(45000);
           session.save(e1);
           session.save(e2);
           session.save(e3);
           session.save(e4);
           transaction.commit();
          // lets do criteria query
           Criteria cr = session.createCriteria(Employee.class);
           List<Employee> results = cr.list();
           System.out.println(results);

            }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}

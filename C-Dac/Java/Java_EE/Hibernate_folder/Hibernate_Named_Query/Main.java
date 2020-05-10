package mypack;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
           Query query = session.getNamedQuery("findEmployeeByName");  
           query.setString("name", "pqr");  
                 
           List<Employee> employees=query.list();  
                 
           Iterator<Employee> itr=employees.iterator();  
            while(itr.hasNext()){  
           Employee e=itr.next();  
           System.out.println(e);  
            }  
            
            query = session.getNamedQuery("findEmployeeBySalary");  
            query.setString(0,"25000");  
                  
            employees=query.list();  
                  
            itr=employees.iterator();  
             while(itr.hasNext()){  
            Employee e=itr.next();  
            System.out.println(e);  
             }  
           
            }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}

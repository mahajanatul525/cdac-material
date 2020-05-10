package mypack;
import org.hibernate.Criteria;
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
          // lets do criteria query
           Criteria cr1 = session.createCriteria(Employee.class);
           List<Employee> results = cr1.list();
           System.out.println(results);
           System.out.println("Using Restrictions");
          
           cr1.add(Restrictions.eq("salary", 25000.00));
            results = cr1.list();
            System.out.println(results);
         
         // To get records having salary more than 25000
            cr1=session.createCriteria(Employee.class);
            cr1.add(Restrictions.gt("salary", 25000.00));
            results = cr1.list();
            System.out.println(results);
            
            // To get records having salary less than 26000
            cr1=session.createCriteria(Employee.class);
            cr1.add(Restrictions.lt("salary", 26000.00));
            results = cr1.list();
            System.out.println(results);
            
            // To get records having fistName starting with P
            cr1=session.createCriteria(Employee.class);
            cr1.add(Restrictions.like("name", "P%"));
            results = cr1.list();
            System.out.println(results);

            // Case sensitive form of the above restriction.
            cr1=session.createCriteria(Employee.class);
            cr1.add(Restrictions.ilike("name", "p%"));
            results = cr1.list();
            System.out.println(results);

            // To get records having salary in between 30000 and 50000
            cr1=session.createCriteria(Employee.class);
            cr1.add(Restrictions.between("salary", 30000.00, 50000.00));
            results = cr1.list();
            System.out.println(results);
            
            cr1=session.createCriteria(Employee.class);

            Criterion salary = Restrictions.gt("salary", 20000.00);
            Criterion desig = Restrictions.eq("desig","manager");

            // To get records matching with OR conditions
            LogicalExpression andExp = Restrictions.and(salary,desig);
            cr1.add(andExp );
            results = cr1.list();
            System.out.println(results);
            
            cr1=session.createCriteria(Employee.class);

            Criterion salary1 = Restrictions.gt("salary", 30000.00);
            Criterion name = Restrictions.eq("name","pqr");

            // To get records matching with OR conditions
            LogicalExpression orExp = Restrictions.or(salary1, name);
            cr1.add(orExp);
            results = cr1.list();
            System.out.println(results);
            cr1=session.createCriteria(Employee.class);
            cr1.addOrder(Order.desc("salary"));
            results = cr1.list();
            Iterator<Employee> itr=results.iterator();
            while(itr.hasNext())
            {
            	System.out.println(itr.next());
            }
            cr1=session.createCriteria(Employee.class);
            cr1.addOrder(Order.asc("salary"));
            results = cr1.list();
            itr=results.iterator();
            while(itr.hasNext())
            {
            	System.out.println(itr.next());
            }
            cr1 = session.createCriteria(Employee.class);

         // To get total row count.
         cr1.setProjection(Projections.rowCount());
         results=cr1.list();
         System.out.println(results);
         cr1 = session.createCriteria(Employee.class);

         // To get average of a salary
         cr1.setProjection(Projections.avg("salary"));
         results=cr1.list();
         System.out.println(results);
         cr1 = session.createCriteria(Employee.class);

         // To findout maximum salary
         cr1.setProjection(Projections.max("salary"));
         results=cr1.list();
         System.out.println(results);
         cr1 = session.createCriteria(Employee.class);

         // To findout minimum salary
         cr1.setProjection(Projections.min("salary"));
         results=cr1.list();
         System.out.println(results);
         cr1 = session.createCriteria(Employee.class);

         // To findout sum of salary
         cr1.setProjection(Projections.sum("salary"));
         results=cr1.list();
         System.out.println(results);
            }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}

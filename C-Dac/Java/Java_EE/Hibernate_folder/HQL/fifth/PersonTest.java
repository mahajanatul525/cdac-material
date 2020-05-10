package mypack;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tx = null; 
		try
		{
			tx=session.beginTransaction();
			Scanner sc=new Scanner(System.in);
			int cnt=0;
			while(cnt<4)
			{
			System.out.println("Enter name");	
			String name=sc.next();
			System.out.println("Enter age");
			int age=sc.nextInt();
			Person p1=new Person(name,age);
			session.save(p1);
			cnt++;
			}
			tx.commit();
			
			
			Query query=session.createQuery("from Person");
			List mylist1=query.list();
			
			System.out.println(mylist1);
			tx=session.beginTransaction();
			query=session.createQuery("update Person p set p.name='Amar'");
			int k=query.executeUpdate();
			tx.commit();
			System.out.println("Records updated\t"+k);
									
			query=session.createQuery("from Person");
			mylist1=query.list();
		
			System.out.println(mylist1);
			tx=session.beginTransaction();
			query=session.createQuery("update Person p set p.name=:str");
			query.setString("str","vishal");
			k=query.executeUpdate();
			tx.commit();
			System.out.println("Records updated\t"+k);
				
			
			query=session.createQuery("from Person");
			mylist1=query.list();
			
			System.out.println(mylist1);
			tx=session.beginTransaction();
			query=session.createQuery("update Person p set p.name=:str1 where p.age > :j");
			query.setString("str1","varun");
			query.setString("j","30");
			k=query.executeUpdate();
			tx.commit();
			System.out.println("Records updated\t"+k);
			
			
			query=session.createQuery("from Person");
			mylist1=query.list();
			
			System.out.println(mylist1);
tx=session.beginTransaction();
			query=session.createQuery("update Person p set p.name=? where p.age <?");
			query.setString(0,"sanjay");
			query.setString(1,"18");
			k=query.executeUpdate();
			tx.commit();
			System.out.println("Records updated\t"+k);
			
			
			query=session.createQuery("from Person");
			mylist1=query.list();
			
			System.out.println(mylist1);
			session.close();
			System.out.println("Done with Person");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


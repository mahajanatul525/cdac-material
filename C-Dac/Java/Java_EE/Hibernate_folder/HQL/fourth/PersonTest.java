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
			
			
			Query query=session.createQuery("from Person c order by c.age");
			List mylist1=query.list();
			
			for(int i=0;i<mylist1.size();i++)
			{
				System.out.println(mylist1.get(i));
			}

System.out.println("...................................");

			query=session.createQuery("from Person c order by c.age desc");
			mylist1=query.list();
			
			for(int i=0;i<mylist1.size();i++)
			{
				System.out.println(mylist1.get(i));
			}

System.out.println("...................................");

			query=session.createQuery("from Person c order by c.age desc, c.name asc");
			mylist1=query.list();
			
			for(int i=0;i<mylist1.size();i++)
			{
				System.out.println(mylist1.get(i));
			}
			session.close();
			System.out.println("Done with Person");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


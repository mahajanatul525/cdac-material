package mypack;
import java.util.List;
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

			
			query=session.createQuery("select c.name from Person c");
			mylist1=query.list();
			
			System.out.println(mylist1);
			
	query=session.createQuery("select c.name,c.age from Person c");
			mylist1=query.list();
			
			for(int i=0;i<mylist1.size();i++)
        		{
		            Object str[]=(Object[])mylist1.get(i);
		            for(int j=0;j<str.length;j++)
		            {
		                System.out.print(str[j]+"\t");
		            }
		            System.out.println();
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

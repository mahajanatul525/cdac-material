package mypack;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SupportPropertyTest 
{
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null;      
		try
		{
			transaction = session.beginTransaction(); 
			SupportProperty ob=new SupportProperty();
			ob.setName("anil");
			HashMap h=new HashMap();
			h.put("score","50");
			h.put("grade","A");
			ob.setProperties(h);
			session.save(ob);
			transaction.commit();
			session.close();
		
		
			session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			Query q=session.createQuery("from SupportProperty");
			List mylist=q.list();
			SupportProperty ob1=(SupportProperty)mylist.get(0);
			Map p1=ob1.getProperties(); // still child is not retrieved
			System.out.println("Now with default-lazy=true, but retrieving child before session close");
			System.out.println("After getProperties\t");
			
			transaction.commit();
		//	session.close(); No ! not here
			
			System.out.println(p1.get("score")); // now child is retrieved
			System.out.println(p1.get("grade"));
			session.close();
			System.out.println("it is all over");

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}

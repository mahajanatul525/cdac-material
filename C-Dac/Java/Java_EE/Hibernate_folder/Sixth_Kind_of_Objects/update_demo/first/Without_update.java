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
          //  p.setId(1);
            p.setName("soap");
            p.setQty(75);
            p.setPrice(90);
            session.save(p);      
            transaction.commit(); 
            session.close();
            System.out.println("before changing qty\t"+p);
            p.setQty(150); // detached
            System.out.println("after changing qty\t"+p);
            Scanner sc=new Scanner(System.in);
            System.out.println(sc.nextInt()); // go and check the database, u wont find changes
            session=HibernateUtil.getSessionFactory().openSession();
            transaction=session.beginTransaction();
            transaction.begin();
           // session.update(p); //reassociate detached entity with a new session
            transaction.commit(); 
            session.close();
            
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}

output:

Hibernate: insert into Product (name, price, qty, id) values (?, ?, ?, ?)
before changing qty	Product [name=soap, qty=75, price=90.0]
after changing qty	Product [name=soap, qty=150, price=90.0]

go and check mysql 

mysql> select * from product;
+----+------+-------+------+
| id | name | price | qty  |
+----+------+-------+------+
|  0 | soap |    90 |   75 |
+----+------+-------+------+
1 row in set (0.00 sec)

now come back in eclipse and enter some number 

once again go and check database because u have created a new session.

go and check in MySQL

mysql> select * from product;
+----+------+-------+------+
| id | name | price | qty  |
+----+------+-------+------+
|  0 | soap |    90 |   75 |
+----+------+-------+------+
1 row in set (0.00 sec)

no changes because your entity was detached when u made changes to it and even after creating a new session, u haven't associated entity with it.

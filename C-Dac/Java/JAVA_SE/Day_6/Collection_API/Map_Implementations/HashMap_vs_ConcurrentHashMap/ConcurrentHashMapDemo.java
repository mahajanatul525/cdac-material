import java.util.*;
import java.util.concurrent.*;
public class ConcurrentHashMapDemo
{
	public static void main(String args[])
	{
		ConcurrentHashMap <String,Double>h=new ConcurrentHashMap<String,Double>();
		h.put("john",3434.34);
		h.put("tom",123.12);
		h.put("jane",1378.00);
		h.put("todd",99.22);
		// get a set of entries
		Set set=h.entrySet();
		// get an iterator
		Iterator i=set.iterator();
		// display elements
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
			h.put("abc",100.5); // no exception
		}
		System.out.println();
		//deposit 1000 in john's account
		double balance=((Double)h.get("john"));
		h.put("john",balance+1000);
		System.out.println("john's new balance  "+h.get("john"));
		System.out.println("After Modification");
		i=set.iterator();
		// display elements
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
		}
	}
}








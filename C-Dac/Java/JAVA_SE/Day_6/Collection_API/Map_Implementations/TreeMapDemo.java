import java.util.*;
import static java.lang.System.*;
public class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap <String,Double>h=new TreeMap<String,Double>();
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
			out.print(me.getKey()+ ":");
			out.println(me.getValue());
		}
		out.println();
		//deposit 1000 in john's account
		double balance=(Double)h.get("john");
		h.put("john",balance+1000);
		out.println("john's new balance  "+h.get("john"));
	}
}
		

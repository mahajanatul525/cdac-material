import java.util.*;
public class trial 
{
	 void disp(List mylist)
	{
		mylist.add("hello");
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String args[])
	{
		List<Integer>m=new ArrayList<Integer>();
		m.add(20);
		m.add(40);
		trial t=new trial();
		t.disp(m);

		Integer val=m.get(2);
		System.out.println(val);


	}
}


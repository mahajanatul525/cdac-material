import java.util.*;
import static java.lang.System.*;
public class IteratorDemo
{
	public static void main(String  args[])
	{
		ArrayList <String>t=new ArrayList<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		out.println("contents are  "+t);
		Iterator <String>i=t.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			out.print(element +"\t");
		}
		out.println();
		ListIterator <String>li=t.listIterator();	
		while(li.hasNext())
		{
			Object element1=li.next();
			li.set(element1 + "+");
		}
		out.println("Modified contents of  t ar as follows");
		i=t.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			out.print(element +"\t");
		}
		out.println("\nModified list backwards ");
		while(li.hasPrevious())
		{
			Object element1=li.previous();
			out.print(element1 + "\t");
		}
		out.println();
	}
}
		

	

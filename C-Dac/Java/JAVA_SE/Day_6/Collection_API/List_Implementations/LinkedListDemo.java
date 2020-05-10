import java.util.*;
import static java.lang.System.*;
public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList <String>l=new LinkedList<String>();
		l.add("f");
		l.add("b");
		l.add("d");
		l.add("e");
		l.add("c");
		l.addLast("z");
		l.addFirst("a");
		l.add(1,"a2");
		out.println("Original contents of l  "+l);
		l.remove("f");
		l.remove(2);
		out.println("Contents after deletion  "+l);
		l.removeFirst();
		l.removeLast();
		out.println("contents after deleting first and last "+l);
		Object val=l.get(2);
		out.println("l after change is "+l);
	}
}
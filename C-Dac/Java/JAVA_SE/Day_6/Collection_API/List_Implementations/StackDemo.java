import java.util.*;
import static java.lang.System.*;
public class StackDemo
{
	static void showpush(Stack <Integer>st,int a)
	{
		st.push(a);
		out.println("push("+a+")");
		out.println("stack "+st);
	}
	static void showpop(Stack <Integer> st)
	{
		out.println("pop ->");
		int a=(Integer)st.pop();
		out.println(a);
		out.println("stack "+st);
	}
	public static void main(String arg[])
	{
		Stack <Integer>st=new Stack<Integer>();
		out.println("stack "+st);
		showpush(st,42);
		showpush(st,66);
		showpush(st,99);
		showpop(st);
		showpop(st);
		showpop(st);
		try
		{
			showpop(st);
		}
		catch(EmptyStackException ee)
		{
			out.println(ee);
		}
	}
}
	

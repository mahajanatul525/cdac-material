// interesting observation regarding following code
// when u call get, the sequence is "hashCode()","==" 
// if == returns false , it checks "equals"

import java.util.*;
class Number
{
	int num;
	public boolean equals(Object ob)
	{
		System.out.println("in equals");
		return num==((Number)ob).num;
	}
	
	public int hashCode()
	{
		System.out.println("in hashcode");
		return num;
	}
	public Number(int num)
	{
		this.num=num;
	}
	public String toString()
	{
		return ""+num;
	}
}
public class Trial1
{
	public static void main(String args[])
	{
		HashMap<Number,String> h=new HashMap<Number,String>();
		Number n1=new Number(20);
		Number n3=new Number(20);
		h.put(n1,"first");
		Number n4=n1;

		System.out.println(h);

		System.out.println("Now Retrieval");
		
		//String ref=h.get(n1);//hashcode  it checks ==, since == true it does not invoke equals
		//String ref=h.get(n3);//hashcode and equals , it checks ==, since == returns false it invokes equals

		//String ref=h.get(n4);//hashcode  it checks ==, since == true it does not invoke equals

		//String ref=h.get(new Number(20));//hashcode and equals , it checks ==, since == returns false it invokes equals

		
		System.out.println(ref);
	}
}
	

class A
{
	String str="hello";
}
public class StringDemo6
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s2=new String("hello");
	
		String s3="hello";
		String s4="hello";

		if(s1==s2)
		{
			System.out.println("s1 and s2 are ==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}
		if(s1==s3)
		{
			System.out.println("s1 and s3 are ==");
		}
		else
		{
			System.out.println("s1 and s3 are not ==");
		}
		A ob=new A();
		if(s1==ob.str)
		{
			System.out.println("s1 and ob.str are ==");
		}
		else
		{
			System.out.println("s1 and ob.str are not ==");
		}
	}
}
	
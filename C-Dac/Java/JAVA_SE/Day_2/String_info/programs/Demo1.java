public class Demo1
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2=new String("hello");

		if(s1==s2)
		{
			System.out.println("s1 and s2 are==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}
		/*s2=s2.intern();
		System.out.println("After intern() method");
		if(s1==s2)
		{
			System.out.println("s1 and s2 are==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}*/
	System.out.println("After intern() method");
		if(s1==s2.intern())
		{
			System.out.println("s1 and s2 are==");
		}
		else
		{
			System.out.println("s1 and s2 are not ==");
		}
		String s3="hello";
		if(s1==s3)
		{
			System.out.println("s1 and s3 are==");
		}
		else
		{
			System.out.println("s1 and s3 are not ==");
		}
		System.out.println("after s1=null");
		s1=null;
		if(s1==s3)
		{
			System.out.println("s1 and s3 are==");
		}
		else
		{
			System.out.println("s1 and s3 are not ==");
		}
		if(s2==s3)
		{
			System.out.println("s2 and s3 are==");
		}
		else
		{
			System.out.println("s2 and s3 are not ==");
		}
	}
}
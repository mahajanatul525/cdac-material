public class StringDemo
{
	public static void main(String args[])
	{
		String s1=new String("hello");
		String s2="hello";
		String s3="hello";
		String a="he";
		String b="llo";
		//String s4="he"+"llo";
		String s4=a+b;
		if(s1==s2)
		{
			System.out.println("s1 and s2 are==");
		}
		else
		{
			System.out.println("s1 and s2 are not==");
		}

	if(s2==s3)
		{
			System.out.println("s2 and s3 are==");
		}
		else
		{
			System.out.println("s2 and s3 are not==");
		}

		if(s2==s4)
		{
			System.out.println("s2 and s4 are==");
		}
		else
		{
			System.out.println("s2 and s4 are not==");
		}

		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equals");
		}
		else
		{
			System.out.println("s1 and s2 are not equals");
		}

		if(s2.equals(s4))
		{
			System.out.println("s2 and s4 are equals");
		}
		else
		{
			System.out.println("s2 and s4 are not equals");
		}

		System.out.println("Displaying Their hashcodes");
		System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
System.out.println(s4.hashCode());
	}
}

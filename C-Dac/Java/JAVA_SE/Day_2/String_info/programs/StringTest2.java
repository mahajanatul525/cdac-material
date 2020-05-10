public class StringTest2
{
	public static void main(String args[])
	{
		String str1="hello";
		String str2="hello";
		if(str1==str2)
		{
			System.out.println("both are ==");
		}
		else
		{
			System.out.println("both are not ==");
		}
		String str3=new String("hello");
		if(str1==str3)
		{
			System.out.println("both are ==");
		}
		else
		{
			System.out.println("both are not ==");
		}
		String str4="hel"+"lo";
		if(str1==str4)
		{
			System.out.println("both are ==");
		}
		else
		{
			System.out.println("both are not ==");
		}
		if(str1.equals(str4))
		{
			System.out.println("both are equals");
		}
		else
		{
			System.out.println("both are not equals");
		}
		String str5="hel";
		String str6="lo";

		if(str1==(str5+str6))
		{
			System.out.println("both are ==");
		}
		else
		{
			System.out.println("both are not ==");
		}
		if(str1.equals(str5+str6))
		{
			System.out.println("both are equals");
		}
		else
		{
			System.out.println("both are not equals");
		}
		
		
	}
}
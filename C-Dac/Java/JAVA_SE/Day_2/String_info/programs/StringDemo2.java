public class StringDemo2
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s2=new String("Hello");

		System.out.println(s1);
		System.out.println(s2);

		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equals");
		}
		else
		{
			System.out.println("s1 and s2 are not equals");
		}

		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("s1 and s2 are equalsIgnoreCase");
		}
		else
		{
			System.out.println("s1 and s2 are not equalsIgnoreCase");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
	
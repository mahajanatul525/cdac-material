public class StringDemo1
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s2=new String("hello");

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
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
	
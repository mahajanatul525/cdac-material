public class StringTest1
{
	public static void main(String args[])
	{
		String str1="hello";
		String str2="Hello";
		if(str1.equals(str2))
		{
			System.out.println("both are equals");
		}
		else if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("both are not equals");
		}
	}
}
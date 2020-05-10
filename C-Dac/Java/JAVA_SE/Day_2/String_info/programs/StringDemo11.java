// String class is immutable
public class StringDemo11
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s3="hello";
		System.out.println(s1);
		System.out.println(s3);
		final String s4="he";

		if(s1==(s4+"llo"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
	
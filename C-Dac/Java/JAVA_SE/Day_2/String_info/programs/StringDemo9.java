// String class is immutable
public class StringDemo9
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s3="hello";
		System.out.println(s1);
		System.out.println(s3);

		if(s1==("he"+"llo"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
	
// String class is immutable
public class StringDemo8
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s3="hello";
		System.out.println(s1);
		System.out.println(s3);

		//System.out.println(s1.concat("world"));

		String ref=s1.concat("world");
		System.out.println(ref);

		System.out.println(s1);
		System.out.println(s3);

	}
}
	
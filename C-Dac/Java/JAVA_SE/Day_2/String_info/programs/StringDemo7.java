package core1;
// String class is immutable
public class StringDemo7
{
	public static void main(String args[])
	{
		String s1="hello";
	
		String s3="hello";
		System.out.println(s1);
		System.out.println(s3);

		String s4=s1.concat("world");
//String s4="hello".concat("world"); 
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
		String s5="helloworld";
		if(s4==s5)
		{
			System.out.println("s4 and s5 are ==");
		}
		else
		{
			System.out.println("s4 and s5 are not ==");
		}
			
		if(s4.intern()==s5)
		{
			System.out.println("s4's intern and s5 are ==");
		}
		else
		{
			System.out.println("s4's intern and s5 are not ==");
		}

	}
}
	

/*

output:

hello
hello
hello
hello
helloworld
s4 and s5 are not ==
s4's intern and s5 are ==



*/

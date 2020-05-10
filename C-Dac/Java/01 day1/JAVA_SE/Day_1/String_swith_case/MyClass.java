import java.util.*;
public class MyClass
{
	public static void main(String args[])
	{
		System.out.println("Enter user name");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		switch(str)
		{
			case "admin": System.out.println("u r given 10 rights");
					break;
			case "faculty": System.out.println("u r given 7 rights");
					break;
			default: System.out.println("no rights");
		}
	}
}
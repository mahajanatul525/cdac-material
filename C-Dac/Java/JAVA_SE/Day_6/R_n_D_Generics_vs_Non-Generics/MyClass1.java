import java.util.*;
public class MyClass1
{
	static void disp1(Integer ob)
	{
		System.out.println("disp1 Integer");
	}
	static void disp1(String ob)
	{
		System.out.println("disp1 String");
	}
	public static void main(String args[])
	{
		//disp1(null); //ambiguity error
		disp1(100);   // no error
		disp1("hello"); // no error
	}
}

/*
check it in cavaj

*/
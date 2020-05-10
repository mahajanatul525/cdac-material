import java.util.*;
public class MyClass2
{
	static void disp1(Integer ob)
	{
		System.out.println("disp1 Integer");
	}
	static void disp1(Object ob)
	{
		System.out.println("disp1 Object");
	}
	public static void main(String args[])
	{
		disp1(null); // Integer method
// As Integer type is more specific than Object type, compiler chooses most specific type 
		disp1(100);   
		disp1("hello"); 
	}
}

/*

in cavaj

  disp1(((Integer) (null)));

*/



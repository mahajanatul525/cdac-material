// in case of static , early resolution
// in case of non-static ,lazy resolution
public class Test5
{
	
	static 
	{
		System.out.println("in Test5 first static block");
		// System.out.println("value of val is\t"+val); error: Cannot reference a field before it is defined
	}

	{
		System.out.println("in Test5 first non-static block");
	}

	
	
	static 
	{
		System.out.println("in Test5 second static block");
	}

	static Emp ref=new Emp();
	static int val=100;

	public Test5()
	{
		System.out.println("in Test5 no-arg constr");
	}

	{
		System.out.println("in Test5 second non-static block");
	}		

	public static void main(String args[])
	{
		System.out.println("in main");
		Test5 t=new Test5();
	}
}
class Emp
{
	static
	{
		System.out.println("Emp static block");
	}
	Emp()
	{
		System.out.println("Emp no-arg constru");
	}
	{
		System.out.println("Emp non-static block");
	}
}
// in case of static , early resolution
// in case of non-static ,lazy resolution
public class Test6
{
	static int val=100;
	static 
	{
		System.out.println("in Test6 first static block");
		System.out.println("value of val is\t"+val); // no problem
	}

	{
		System.out.println("in Test6 first non-static block");
	}

	
	
	static 
	{
		System.out.println("in Test6 second static block");
	}

	static Emp ref=new Emp();
	

	public Test6()
	{
		System.out.println("in Test6 no-arg constr");
	}

	{
		System.out.println("in Test6 second non-static block");
	}		

	public static void main(String args[])
	{
		System.out.println("in main");
		Test6 t=new Test6();
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
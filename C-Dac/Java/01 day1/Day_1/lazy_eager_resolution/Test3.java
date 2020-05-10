// in case of static , early resolution
// in case of non-static ,lazy resolution
public class Test3
{
	
	static 
	{
		System.out.println("in Test3 first static block");
	}

	{
		System.out.println("in Test3 first non-static block");
	}

	static Emp ref=new Emp();
	
	static 
	{
		System.out.println("in Test3 second static block");
	}

	public Test3()
	{
		System.out.println("in Test3 no-arg constr");
	}

	{
		System.out.println("in Test3 second non-static block");
	}		

	public static void main(String args[])
	{
		System.out.println("in main");
		Test3 t=new Test3();
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
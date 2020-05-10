// in case of static , early resolution
// in case of non-static ,lazy resolution
public class Test2
{
	
	static Emp ref=new Emp();
	static 
	{
		System.out.println("in Test2 static");
	}

	{
		System.out.println("in Test2 first non-static block");
	}

	public Test2()
	{
		System.out.println("in Test2 no-arg constr");
	}

	{
		System.out.println("in Test2 second non-static block");
	}		

	public static void main(String args[])
	{
		System.out.println("in main");
		Test2 t=new Test2();
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
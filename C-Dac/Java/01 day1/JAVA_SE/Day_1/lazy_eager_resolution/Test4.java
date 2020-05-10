// in case of static , early resolution
// in case of non-static ,lazy resolution
public class Test4
{
	
	static 
	{
		System.out.println("in Test4 first static block");
	}

	{
		System.out.println("in Test4 first non-static block");
	}

	
	
	static 
	{
		System.out.println("in Test4 second static block");
	}

	static Emp ref=new Emp();

	public Test4()
	{
		System.out.println("in Test4 no-arg constr");
	}

	{
		System.out.println("in Test4 second non-static block");
	}		

	public static void main(String args[])
	{
		System.out.println("in main");
		Test4 t=new Test4();
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
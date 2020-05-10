// in case of static , early resolution
// in case of non-static ,lazy resolution
public class Test1
{
	
	/*static*/ Emp ref=new Emp();
	static 
	{
		System.out.println("in Test1 static");
	}

	{
		System.out.println("in Test1 first non-static block");
	}

	public Test1()
	{
		System.out.println("in Test1 no-arg constr");
	}

	{
		System.out.println("in Test1 second non-static block");
	}		

	public static void main(String args[])
	{
		System.out.println("in main");
		Test1 t=new Test1();
	}
}
class Emp
{
	static
	{
		System.out.println("Emp static block");
	}
}
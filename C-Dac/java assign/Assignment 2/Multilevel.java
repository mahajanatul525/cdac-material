/*Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class constructor from child class ?*/

class Base
{
	public Base()
	{
	  System.out.println("In base");
	}
}

class Child1 extends Base
{
	public Child1()
	{
	  System.out.println("In child 1");
	}
}

class Child2 extends Child1
{
	public Child2()
	{
	  System.out.println("In child 2");
	}
}

public class Multilevel
{

     public static void main(String args[])
	{
		Child2 c=new Child2();
	}

}
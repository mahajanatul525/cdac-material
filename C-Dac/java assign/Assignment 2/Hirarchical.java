/*Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.*/

class Parent1
{
	public Parent1()
	{
	 System.out.println("In Parent1");
	}
}

class Child1 extends Parent1
{
	public Child1()
	{
	 System.out.println("In Child1");
	}
}

class Child2 extends Parent1
{
	public Child2()
	{
	 System.out.println("In Child2");
	}
}


public class Hirarchical
{

     public static void main(String args[])
	{
		Child2 c = new Child2();
		Child1 c1 = new Child1();
	}

}
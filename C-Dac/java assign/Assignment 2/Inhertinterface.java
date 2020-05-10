/* Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.

*/

class Parent1
{
	void disp1()
	{
		System.out.println("In disp1 of Parent1");
	}
	void base()
	{
	 System.out.println("In base of Parent1");
	}
}

interface Parent2
{
	void disp2();
}

class Child extends Parent1 implements Parent2 
{
	public void disp2()
	{
		System.out.println("In disp2 of Child");
	}
	public void fun()
	{
		System.out.println("In fun of Child");
	}
	void disp1()
	{
		System.out.println("In disp1 of Child");
	}
}


public class Inhertinterface
{

     public static void main(String args[])
	{
		Child obj= new Child();
		obj.disp1();
		obj.disp2();
		obj.fun();
		
		
	}

}
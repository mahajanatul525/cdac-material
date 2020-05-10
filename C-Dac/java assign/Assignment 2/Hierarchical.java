/*Interface*/

interface Parent1
{
	void disp();
}

class Parent2
{
	public Parent2()
	{
	 System.out.println("In Parent2");
	}
}

class Child extends Parent2 implements Parent1
{
	public Child()
	{
	 System.out.println("In Child");
	}

	public void disp()
	{
	 System.out.println("In child disp");
	}
}


public class Hierarchical
{

     public static void main(String args[])
	{
		Child c = new Child();
	}

}
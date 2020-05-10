/*Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.
*/

class Top1
{
	public void disp1()
	{
	 System.out.println("In Top1");
	}
}

class Bottom1 extends Top1
{
	public void disp1()
	{
	 System.out.println("In Bottom1");
	}
}

class Bottom2 extends Top1
{
	public void disp1()
	{
	 System.out.println("In Bottom2");
	}
}

class Bottom3 extends Top1
{
	public void disp1()
	{
	 System.out.println("In Bottom3");
	}
}

public class Dynamicpoly
{

     public static void main(String args[])
	{
		Top1 t = new Bottom1();
		t.disp1();
		
		Top1 t1 = new Bottom2();
		t1.disp1();

		
		Top1 t2 = new Bottom3();
		t2.disp1();
	}

}
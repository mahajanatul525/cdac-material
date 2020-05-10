/*Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.
*/

interface A
{
	void disp1();
}

interface B extends A
{
	void disp2();
}

class C implements B
{
	public void disp2()
	{
		System.out.println("In disp2 of B");
	}
	public void fun()
	{
		System.out.println("In fun of B");
	}
	public void disp1()
	{
		System.out.println("In disp1 of B");
	}

}


public class Exampleinterface
{

     public static void main(String args[])
	{
		C obj= new C();
		obj.disp1();
		obj.disp2();
		obj.fun();
		
		
	}

}
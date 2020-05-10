/*  Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.

*/

class Base1
{
	public Base1(int var)
	{
		System.out.println("In param of Base1");
	}
	
}

class Sub1 extends Base1 
{
	public Sub1()
	{
		super(10);
		System.out.println("In no-arg of sub1");
	}

	public Sub1(int var)
	{
		super(10);
		System.out.println("In 1 param of sub1");
	}

	public Sub1(int var,int v)
	{
		super(10);
		System.out.println("In 2 param of sub1");
	}

}


public class Deriveconstructors
{

     public static void main(String args[])
	{
	    Sub1 s1=new Sub1();
	    Sub1 s2=new Sub1(10);
	    Sub1 s3=new Sub1(10,20);
	}

}
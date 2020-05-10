package java8;
public class Outer
{
	int num1=30; 
	void disp1()
	{
		System.out.println("in disp1 of Outer");
	}
	void indisp()
	{
		System.out.println("Inside Outer indisp");
	}		
	void fun(int k) 
	{
		 int val1=90; 
		final int val2=100; 

		 class inner
		{
			int num2=50;  
			void indisp()
			{
				System.out.println(num1);
				System.out.println(k); 
				System.out.println(val1); 
				System.out.println(val2);
				System.out.println(num2);
			}
		void disp1()
		{
			System.out.println("in disp1 of inner");
		}
		}
		inner ob=new inner();
		ob.indisp();
		System.out.println("method over");
	}
	void disp2(final int v)
	{
		System.out.println(v);
	}		
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.disp1();
		o.fun(400);
	}
}
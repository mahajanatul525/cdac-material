// in this program, since "return" is given inside "finally",compiler will remove "return" statements from both "try" and "catch" blocks.

public class Example12
{
	void accept(int k)
	{
		if(k<=0)
		{
			throw new RuntimeException("invalid value");
		}
	}
	int disp(int k)
	{
		try
		{
			accept(k);
			return 1;
		}
		catch(Exception ex)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String args[])
	{
		Example12 e=new Example12();
		System.out.println(e.disp(5));
		//System.out.println(e.disp(-5));
	}
}





				
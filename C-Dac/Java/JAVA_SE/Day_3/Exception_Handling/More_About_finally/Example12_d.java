

public class Example12_d
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
			System.out.println("in finally");
		}
	}
	public static void main(String args[])
	{
		Example12_d e=new Example12_d();
		System.out.println(e.disp(5));
		//System.out.println(e.disp(-5));
	}
}





				
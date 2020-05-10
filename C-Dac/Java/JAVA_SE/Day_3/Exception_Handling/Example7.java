// one try , multiple catch blocks.
public class Example7
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		System.out.println("Array created");
		try
		{
			arr[4]=10;
		}
		catch(Exception ae) 
		{
			System.out.println(ae);
		}
		System.out.println("Array assigned");
	}
}













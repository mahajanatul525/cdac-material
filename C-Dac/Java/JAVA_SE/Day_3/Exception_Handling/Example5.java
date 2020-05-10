public class Example5
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		System.out.println("Array created");
		try
		{
			arr[4]=10;
		}
		// System.out.println("hello");  Error
		catch(ArrayIndexOutOfBoundsException ae) 
		{
			System.out.println(ae);
		}
		System.out.println("Array assigned");
	}
}
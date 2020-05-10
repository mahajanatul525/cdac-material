public class Example3
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		System.out.println("Array created");
		try
		{
			//arr[4]=10;
			arr[3]=10;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		System.out.println("Array assigned");
	}
}
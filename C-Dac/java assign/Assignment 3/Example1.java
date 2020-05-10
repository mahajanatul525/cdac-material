/* initialize a single dimension array and sort it in ascending order.

*/

public class Example1
{

     public static void main(String args[])
	{
	    //int arr[]=new int[4];
	    int arr[]={99,40,55,30};
int temp;
	    
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("\n"+arr[i]);
		}

	      for (int i = 0; i < arr.length; i++)
		{
		  for(int j=0;j<arr.length;j++)
		   {
			if(arr[i]<arr[j])
			{ 
			temp=arr[i];
			   arr[i]=arr[j];
			arr[j]=temp;
			}
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("\n"+arr[i]);
		}
	}

}
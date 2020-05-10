package vardha;
import java.io.*;
public class V1 {

	public static void main(String args[])
	{
		char arr[]={'v','a','m'};
		try(FileWriter fw=new FileWriter("abc.txt",true))
		{
			char arr1[]={'v','i','t','a'};
			fw.write(arr1);
			char arr2[]={'a','v','m'};
			fw.write(arr2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try(FileReader fr=new FileReader("abc.txt"))
		{
			//String ss=new String("abc.txt");
			char[] arr3 = new char[(int)new File("abc.txt").length()];
			int a=fr.read(arr3);
			for(int i=0;i<arr3.length;i++)
			{
			System.out.println(arr3[i]);
			}
		try(FileWriter fw=new FileWriter("xyz.txt"))
		{
			
			fw.write(arr3);
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}

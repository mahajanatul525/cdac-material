import java.io.*;
public class Sample
{
	public static void main(String args[])
	{
		try(FileInputStream fis=new FileInputStream("Sample.java"))
		{
			byte arr[]=new byte[2000];
			int k=fis.read(arr);
			String str=new String(arr,0,k);
			System.out.println(str);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
/* BufferedInputStream is used to enhance the performance of reading. Instead of reading one byte at a time from the source ( e.g. File ), we can read block of data from a file inside buffer, and then reading from buffer would be faster comparatively.
Default size of buffer is 8192
*/
import java.io.*;

public class Seventh
{
	public static void main(String args[])
	{
		File f=new File("e:\\FileDemo.java");
		System.out.println(f.length());
		
		if(f.exists())
		{
		try(FileInputStream fis=new FileInputStream(f))
		{
			try(BufferedInputStream bf=new BufferedInputStream(fis))
			{
			System.out.println(bf.available());
			byte arr[]=new byte[(int)f.length()];
			int len=bf.read(arr);
			String data=new String(arr,0,len);
			System.out.println(data);
			}
			}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		}
		else
		{
		System.out.println("Sorry File can not be opened");
		}
		
		
	
	}

}

		
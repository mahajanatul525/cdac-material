import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			Socket ss=new Socket("aouditorium",20000);
			InputStream i=ss.getInputStream();
			
			
			DataInputStream dis=new DataInputStream(i);

			String str="";

				str=dis.readUTF();
				System.out.println(str);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
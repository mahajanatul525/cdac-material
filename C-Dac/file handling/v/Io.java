package Vardha;

import java.io.*;

public class Io {
	
	public static void main(String args[])
	{
		try(FileOutputStream fos = new FileOutputStream("abc.txt",true))
		{
			byte b[]=new byte[100];
			System.out.println("Enter data");
			int k=System.in.read(b);
			fos.write(b,0,k);
		}
		
		catch(IOException ei)
		{
			ei.printStackTrace();
		}
	}

}

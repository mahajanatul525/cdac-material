package Vardha;

import java.io.*;

public class Oi {

	public static void main(String args[])
	{
		File f = new File("abc.txt");
		if(!f.exists())
		{
			System.out.println("File not found");
			System.exit(0);
		}
		try(FileInputStream fis=new FileInputStream(f))
		{
			byte b[]=new byte[(int)f.length()];
			fis.read(b);
			String ss = new String(b);
			System.out.println(ss);
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}

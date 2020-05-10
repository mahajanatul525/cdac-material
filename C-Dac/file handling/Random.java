package vardha;
import java.io.*;

public class Random {
	
	public static void main(String args[])
	{
		try (RandomAccessFile rf = new RandomAccessFile("Vardha.txt","rw"))
		{
			byte b[]=new byte[100];
			rf.seek(rf.length());
			System.out.println("Enter Data");
			int k=System.in.read(b);
			rf.write(b,0,k);
			
			rf.seek(0);
			byte b1[]=new byte[(int)rf.length()];
			rf.read(b1);
			String ss = new String(b1);
			System.out.println(ss);
			
			rf.seek(rf.length());
			System.out.println("Enter Data Again");
			int p=System.in.read(b);
			rf.write(b,0,p);
			
			rf.seek(0);
			byte b2[]=new byte[(int)rf.length()];
			rf.read(b2);
			String ss1 = new String(b2);
			System.out.println(ss1);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}

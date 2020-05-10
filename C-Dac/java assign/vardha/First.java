package vardha;
import java.util.*;
import java.io.*;

public class Filepro {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("lml.txt",true))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
		
			/*byte b[]=new byte[100];
			
			//int k=System.in.read(b);
			
			byte b2=(byte)k;
			
			fos.write(b,10,b2);
			}*/
				int k=1;
				System.out.println("Enter data");
				
				while(k!=0)
				{
					Scanner sc=new Scanner(System.in);
					k=sc.nextInt();
					dos.writeInt(k);
				}
				
				
		}
		catch(Exception e)
		{
		 System.out.println(e);
		}
		
		
		try(FileInputStream fi=new FileInputStream("lml.txt"))
		{
			try(DataInputStream dis=new DataInputStream(fi))
			{
			/*byte[] b1= new byte[(int)new File("pqr.txt").length()];
			fi.read(b1);
			String ss= new String(b1);
			System.out.println(ss);*/
				
				for(int i=0;i<"lml.txt".length();i++)
				{
				System.out.println(dis.readInt());
				}
			}
		}
	}
	catch(Exception e)
		{
		 System.out.println(e);
		}
		
		
		// TODO Auto-generated method stub

	}

}

import java.io.*;
public class Demo2
{
	public static void main(String args[])
	{
			int num=45;
			try(FileInputStream fis=new FileInputStream("d:\\sp.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			Special ref=(Special)ois.readObject();
			System.out.println(ref);
			}
			}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
import java.io.*;
public class Demo1
{
	public static void main(String args[])
	{
			Special s=new Special();
			try(FileOutputStream fos=new FileOutputStream("d:\\sp.txt"))
			{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(s);
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}

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
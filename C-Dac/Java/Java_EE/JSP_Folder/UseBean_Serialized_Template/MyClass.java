import java.io.*;
import mypack.*;
public class MyClass
{
	public static void main(String args[])
	{
		MyBean mb=new MyBean();
		mb.setName("Sachin");
		try(FileOutputStream fos=new FileOutputStream("MyBean.ser"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(mb);
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}

import java.lang.reflect.*;
public class Refl6
{
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("java.lang.String");
			Object arr=Array.newInstance(c,10);
			Array.set(arr,5,"this is a test");
			String s=(String)Array.get(arr,5);
			System.out.println(s);
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
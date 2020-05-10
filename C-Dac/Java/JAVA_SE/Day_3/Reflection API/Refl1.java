import java.lang.reflect.*;
public class Refl1
{
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName(args[0]);
			Method m[]=c.getDeclaredMethods();
			for(int i=0;i<m.length;i++)
			{
				System.out.println(m[i]);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
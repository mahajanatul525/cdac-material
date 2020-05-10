import java.lang.reflect.*;
public class Refl2
{
	private int f1(Object p,int x)throws NullPointerException
	{
		return x;
	}
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("Refl2");
			Method mlist[]=c.getDeclaredMethods();
			for(int i=0;i<mlist.length;i++)
			{
				Method m=mlist[i];
				System.out.println("name=    "+m.getName());
				System.out.println("Declared class is   "+m.getDeclaringClass());	
		Class pm[]=m.getParameterTypes();
			for(int j=0;j<pm.length;j++)
			{
				System.out.println("param #"+j +"  "+ pm[j]);
			}
		Class ex[]=m.getExceptionTypes();
			for(int j=0;j<ex.length;j++)
			{
				System.out.println("exec   "+j+" " +ex[j]);
			}
			System.out.println("return type   "+m.getReturnType());
			System.out.println("-------");
		}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
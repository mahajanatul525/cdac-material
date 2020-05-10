import java.lang.reflect.*;
public class Refl3
{
	public Refl3()
	{
	}
Refl3(String s)
	{
	}
	protected Refl3(int i,double d)
	{
	}
	
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("Refl3");
			Constructor ctlist[]=c.getDeclaredConstructors();
			for(int i=0;i<ctlist.length;i++)
			{
				Constructor ct=ctlist[i];
				System.out.println("name    "+ct.getName());
System.out.println("Decl class   "+ct.getDeclaringClass());
	Class pm[]=ct.getParameterTypes();
	for(int j=0;j<pm.length;j++)
	{
		System.out.println("param  "+j+ pm[j]);
	}
	Class ex[]=ct.getExceptionTypes();
	for(int k=0;k<ex.length;k++)
	{
		System.out.println("exc   "+ k + ex[k]);
	}
	System.out.println("-------");

	}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
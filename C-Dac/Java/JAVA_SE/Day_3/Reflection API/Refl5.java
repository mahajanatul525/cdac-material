import java.lang.reflect.*;
public class Refl5
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("Refl5");
			Class pm[]=new Class[2];
			pm[0]=Integer.TYPE;
			pm[1]=Integer.TYPE;
			Method m=c.getMethod("add",pm);
		
			Refl5 r=new Refl5();

			Object arglist[]=new Object[2];
			arglist[0]=new Integer(200);
			arglist[1]=new Integer(400);

			Object retobj=m.invoke(r,arglist);
			Integer ob=(Integer)retobj;
			System.out.println(ob.intValue());
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
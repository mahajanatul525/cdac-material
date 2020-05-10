import java.lang.reflect.*;
public class Refl4
{
	private double d;
	public static final int i=37;
	String s="testing";
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("Refl4");
			Field flist[]=c.getDeclaredFields();
			for(int i=0;i<flist.length;i++)
			{
				Field f=flist[i];
				System.out.println("name  "+f.getName());
System.out.println("decl class   "+f.getDeclaringClass());
System.out.println("type    "+f.getType());
int mod=f.getModifiers();
//System.out.println(mod);
System.out.println("modifiers     "+Modifier.toString(mod));			
	System.out.println("-------");

	}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
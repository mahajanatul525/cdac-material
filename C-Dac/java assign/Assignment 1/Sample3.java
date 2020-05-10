public class Sample3
{
	static int var3=200;
	
	public void setnum(int v)
	{
	   this.var3=v;
	}

	public void disp()
	{
	  System.out.println("The num is "+this.var3);
	}


     public static void main(String args[])
	{
		Sample3.disp();		
	}

}
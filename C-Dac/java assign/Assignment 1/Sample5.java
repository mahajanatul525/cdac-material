public class Sample5
{
	int var6;
		
	public Sample5(int v)
	{
	   this.var6=v;
	}

	public void disp()
	{
	   System.out.println(var6);
	}


     public static void main(String args[])
	{
		Sample5 s=new Sample5(100);
		s.disp();
		Sample5 s1=s;
		s1.disp();
	}

}
public class Sample6
{
	int var7;
		
	public Sample6(int v)
	{
	  this.var7=v;
	}
	public void disp()
	{
	   System.out.println(var7);
	}
	public void fun(Sample6 ref)
	{
		ref.var7=600;
	   System.out.println(ref.var7);
	}


     	public static void main(String args[])
	{
		Sample6 s=new Sample6(200);
                s.disp();

                s.fun(s);
		s.disp();
	}

}
public class Sample4
{
	int var4,var5;
	
	public Sample4()
	{
	   this.var4=0;
	  this.var5=0;
	}

	
	public Sample4(int v,int v1)
	{
	   this.var4=v;
	  this.var5=v1;
	}

	public void disp()
	{
	   System.out.println(var4+" "+var5);
	}


     public static void main(String args[])
	{
		Sample4 s=new Sample4();
		s.disp();
		Sample4 s1=new Sample4(20,10);
		s1.disp();
	}

}
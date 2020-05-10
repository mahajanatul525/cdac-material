public class Sample2
{
	int var2;
	
	public void setnum(int v)
	{
	   this.var2=v;
	}

	public int getnum()
	{
	   return this.var2;
	}


     public static void main(String args[])
	{
		Sample2 s=new Sample2();
		s.setnum(100);
		System.out.println(s.getnum());
	}

}
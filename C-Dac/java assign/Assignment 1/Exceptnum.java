public class Exceptnum
{

	public void disp()
	{
	  int num=3;

	  while(num<=30)
	  {
	    if(num==24)
	    {
		num++;
	    }
	  else
	    System.out.println("\n"+num);

	    num++;
	  }

	}

	

     public static void main(String args[])
	{
		Exceptnum n=new Exceptnum();
		n.disp();
	}

}
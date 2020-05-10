public class Numdisp
{
	
	public void disp()
	{
		 int num=1;
	  do
	  {
	    System.out.println("\n"+num);
	    num++;
	  }while(num<=10);
	}

	

     public static void main(String args[])
	{
		Numdisp n=new Numdisp();
		n.disp();
	}

}
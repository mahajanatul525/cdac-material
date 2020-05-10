public class Marksclass
{
	private int marks;

	public Marksclass(int m)
	{
	  this.marks = m;
	} 

	public void disp()
	{
	  if (this.marks>=75)
	   {
		System.out.println("Distinction");
	   }
	  else if (this.marks < 75 && this.marks > 60)
	   {
		System.out.println("First class");
	   }
	  else if (this.marks < 60 && this.marks > 40)
	   {
		System.out.println("Second class");
	   }
	   else
	    System.out.println("Fail");
	}

     public static void main(String args[])
	{
		Marksclass geeta=new Marksclass();
		geeta.disp();
	}

}
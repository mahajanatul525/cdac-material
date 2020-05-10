public class Vowel
{
	private char a;

	public Vowel(char ch)
	{
	  this.a=ch;
	}

	private int swthcase()
	{
	  int flag=0;
		switch(this.a)
		{
		  case 'a': flag=1;
			  break;

		  case 'e': flag=1;
			  break;

		  case 'i': flag=1;
			  break;

		  case 'o': flag=1;
			  break;

		  case 'u': flag=1;
			  break;

		  default: break;
		}
		return flag;
	}

	public void isvowel()
	{
	  int r=swthcase();
	   if(r==1)
	   {
		System.out.println("\n"+this.a+" is a vowel");
	   }
	   else
	   {
		System.out.println("\n"+this.a+" is not vowel");
	    }
	}

     public static void main(String args[])
	{
		Vowel v=new Vowel('e');
		v.isvowel();
	}

}
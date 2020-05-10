/* create interface "Game" , have an abstract method "play()". from this interface define "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo
In this class have a method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,its "play()" method should be invoked.


*/

interface Game
{
	void play();
}

class Cricket implements Game 
{
	public void play()
	{
		System.out.println("In play of Cricket");
	}
}

class Football implements Game 
{
	public void play()
	{
		System.out.println("In play of Football");
	}
}

class Tennis implements Game 
{
	public void play()
	{
		System.out.println("In play of Tennis");
	}
}




public class Demo
{
	public static void perform(Game ref)
	{
		ref.play();
	}
	
     public static void main(String args[])
	{
	    perform(new Cricket());
	     perform(new Football());
	     perform(new Tennis());
	}

}
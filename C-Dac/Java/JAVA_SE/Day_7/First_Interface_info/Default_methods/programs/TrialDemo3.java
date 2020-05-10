interface emp1
{
	default void disp()
	{
		System.out.println("in emp1 disp");
	}
}
interface emp2
{
	void disp();
}
abstract class EmpImpl implements emp2 //,emp2  
{
	/*public void disp()
	{
	}*/
}
public class TrialDemo3
{
	public static void main(String args[])
	{
		//EmpImpl ob=new EmpImpl();
	}
}
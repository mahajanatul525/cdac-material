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
abstract class EmpImpl implements emp1,emp2  
{
	public void disp()
	{
	}
}
public class TrialDemo2
{
	public static void main(String args[])
	{
		//EmpImpl ob=new EmpImpl();
	}
}
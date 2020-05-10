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
abstract class EmpImpl implements emp1,emp2  // error
{
}
public class TrialDemo1
{
	public static void main(String args[])
	{
		//EmpImpl ob=new EmpImpl();
	}
}
package mypack;
public class SavingAccountImpl implements Account 
{
	public SavingAccountImpl()
	{
		System.out.println("in SavingAccountImpl no-arg constructor");
	}
	@Override
	public void deposit() 
	{
		System.out.println("inside saving deposit");
	}

}

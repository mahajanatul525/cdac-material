package mypack;
public class CurrentAccountImpl implements Account 
{
	public CurrentAccountImpl() {
		System.out.println("in CurrentAccountImpl no-arg constructor");
	}
	@Override
	public void deposit() 
	{
        System.out.println("inside current deposit");
	}

}

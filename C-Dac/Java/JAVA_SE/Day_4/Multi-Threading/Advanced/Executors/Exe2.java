import java.util.concurrent.*;
class MyApp
{
	public void run()
	{
		perform();
	}
	public void perform()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello"+i+Thread.currentThread());
		}
	}
}
public class Exe2
{
	public static void main(String args[])
	{
		ExecutorService ex=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			ex.execute(new MyApp());
		}
		Thread.shutdown();
	}
}
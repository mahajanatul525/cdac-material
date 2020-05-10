public class Demo1
{
	void disp(int ...set)
	{
		for(int i=0;i<set.length;i++)
		{
			System.out.println(set[i]);
		}
		for(int k:set)
		{
			System.out.println(k);
		}
	}
	public static void main(String args[])
	{
		new Demo1().disp(10,20,30);
	}
}

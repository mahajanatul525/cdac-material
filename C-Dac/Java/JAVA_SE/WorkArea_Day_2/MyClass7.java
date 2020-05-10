class Sample
{
	private int num;
	public Sample()
	{
	}
	public Sample(int num)
	{
		this.num=num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
		
public class MyClass7
{
	public static void main(String args[])
	{
		Sample s1=new Sample(100);
		System.out.println(s1.getNum());

		Sample s2=new Sample();
		s2.setNum(200);
		System.out.println(s2.getNum());
				
	}
}






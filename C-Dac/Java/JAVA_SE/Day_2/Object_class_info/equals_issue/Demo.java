class MyClass
{
	int num;
	public MyClass(int num)
	{
		this.num=num;
	}
	/*@Override
	public boolean equals(Object ref)
	{
		return num==((MyClass)ref).num;
	}*/
	public boolean equals(MyClass ref)
	{
		System.out.println("in equals method");
		return num==ref.num;
	}
	@Override
	public int hashCode()
	{
		return num;
	}
	@Override
	public String toString()
	{
		return "["+num+"]";
	}
}
public class Demo
{
	public static void main(String args[])
	{
		MyClass m1=new MyClass(100);
		MyClass m2=new MyClass(100);
		System.out.println(m1);
		System.out.println(m2);
		if(m1.equals(m2))
		{
			System.out.println("m1 and m2 are equals");
		}
		else
		{
			System.out.println("m1 and m2 are not equals");
		}
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
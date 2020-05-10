package mypack;

public class MyClass2 
{
	MyClass1 ob1,ob2;
	
	/*public MyClass2(MyClass1 ob1,MyClass1 ob2) {
		super();
		this.ob1=ob1;
		this.ob2=ob2;
		System.out.println("in MyClass2 2 param constr");
	}*/
	public MyClass2(MyClass1 ob1) {
		super();
		this.ob1 = ob1;
		System.out.println("in MyClass2 1 param constr");
	}
	public MyClass2() {
		System.out.println("in MyClass2 no-arg");
	}
	void disp()
	{
		System.out.println("in MyClass2 disp");
		ob1.print();
	}
}

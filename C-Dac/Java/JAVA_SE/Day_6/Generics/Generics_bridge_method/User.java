import java.util.*;
public class User
{
	public static void main(String args[])
	{

		System.out.println("with Integer");

		Integer i1=100,i2=80;
		Comparator ref1 = new MyComparator();
		int comp1 = ref1.compare(i1,i2);
		System.out.println(comp1);
		
		Object a = 5;
		Object b = 6;

		Comparator ref2 = new MyComparator();
		int comp2 = ref2.compare(a, b);
		System.out.println(comp2);
	}
}
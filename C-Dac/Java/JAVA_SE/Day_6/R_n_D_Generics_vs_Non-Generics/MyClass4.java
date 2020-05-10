import java.util.List;
public class MyClass4 
{

/* 

error: name clash: disp(List<Object>) and disp(List<String>) have the same erasure

*/

/*The problem is that Set<Object> and Set<String> are actually treated as a Set from the JVM. Selecting a type for the Set (String or Object in your case) is only syntactic sugar used by the compiler. i.e. compiler removes all the generic type information while compiling the code.

in the following case when the generic type information is removed , we end up having two methods:

	static void disp(List mylist)
	{
		System.out.println("inside String disp");
	}
	static void disp(List mylist)
	{
		System.out.println("inside String disp");
	}

Hence "Ambiguity".

*/
	static void disp(List<String> mylist)
	{
		System.out.println("inside String disp");
	}
	static void disp(List<Object> mylist)
	{
		System.out.println("inside Object disp");
	}
	public static void main(String[] args)
	{
		

	}
}

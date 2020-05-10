public class ReservedKeyWordsDemo
{
	public static void main(String args[])
	{
		System.out.println("hello");
		/*int public=10;
		int static=20;
		int void=30;  Error  */

		int main=40; // No Error
		int String=50; // No Error
		System.out.println(main+"\t"+String);
	}
}
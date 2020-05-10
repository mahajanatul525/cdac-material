public class Demo6
{
	public static void main(String args[])
	{
String s1="hello";
String s2="hello";
String s3=new String("hello");

System.out.println(s1); System.out.println(s2); System.out.println(s3);

if(s1==s2)
{
	System.out.println("s1==s2");
}
else
{
	System.out.println("s1==s2 false");
}
if(s1==s3)
{
	System.out.println("s1==s3");
}
else
{
	System.out.println("s1==s3 false");
}

if(s1.equals(s3))
{
	System.out.println("s1 equals s3");
}
else
{
	System.out.println("s1 equals s3 false");
}

System.out.println(s1.hashCode());
System.out.println(s3.hashCode());
if(s1==s3.intern())
{
	System.out.println("s1==s3_intern");
}
else
{
	System.out.println("s1==s3_intern false");
}

if(s1==s3)
{
	System.out.println("s1==s3");
}
else
{
	System.out.println("s1==s3 false");
}
String str1=new String("ankit");
String str2=new String("ankit");
String str3="ankit";

String str4="admin";
String str5="Admin";

if(str1==str2.intern())
{
	System.out.println("str1==str2_intern");
}
else
{
	System.out.println("str1==str2_intern false");
}
if(str3==str2.intern())
{
	System.out.println("str3==str2_intern");
}
else
{
	System.out.println("str3==str2_intern false");
}
}
}


































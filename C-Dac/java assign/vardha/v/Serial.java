package Vardha;

import java.io.*;
public class Serial implements Serializable {
	String name;
	int id;
	static String contact;
	Serial(String n, int r, String m)
	{
		this.name = n;
		this.id = r;
		this.contact = m;
		
	}
}

class Test 
{
public static void main(String args[])
{
	try
	{
		Serial s = new Serial("vardhaman",1234,"vardhamank93@gmail.com");
		FileOutputStream fos = new FileOutputStream("new.java"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
	}
		catch (Exception e)
		  { e. printStackTrace(); }


try
{
	Serial s = null;
	FileInputStream fis = new FileInputStream("new.java");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Serial s1=(Serial)ois.readObject();
	System.out.println(s1.name);
	System.out.println(s1.id);
	System.out.println(s1.contact);
}
	catch (Exception e)
	  { e. printStackTrace(); }

}
}
		
	








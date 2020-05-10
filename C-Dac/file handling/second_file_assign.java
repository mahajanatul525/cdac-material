/*create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)
*/


package vardha;
import java.io.*;

class Customer implements Serializable
{
	int id;
	String name;
	transient String address;
	int age;

	Customer(int id,String name,String address,int age)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.age=age;
		
	}


}

public class Serial {
	public static void main(String[] args) {
		Customer c=new Customer(1,"Vardhaman","vardha",21);
		try(FileOutputStream fos=new FileOutputStream("anjali.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(c);
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try(FileInputStream fis=new FileInputStream("anjali.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				Customer c1=(Customer)ois.readObject();
				System.out.println(c1.id+"\t"+c1.name+"\t"+c1.address+"\t"+c1.age);
				
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}

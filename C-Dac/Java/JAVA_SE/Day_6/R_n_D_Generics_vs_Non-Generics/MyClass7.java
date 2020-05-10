import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MyClass7 
{
	public static void main(String[] args)
	{
		List<? super String>mylist=null;
		List <Object>mylist1=new ArrayList<Object>();
		mylist1.add("hello");
		mylist1.add(200);
		mylist=mylist1;
		Iterator<? extends Object> itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		mylist.add(null); 
		mylist.add("welcome"); 
		// mylist.add(new Object()); // not possible
		System.out.println("After adding welcome");

		itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}


/*

After compilation:

 ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add("hello");
        arraylist1.add(Integer.valueOf(200));
        arraylist = arraylist1;
        for(Iterator iterator = arraylist.iterator(); iterator.hasNext(); System.out.println(iterator.next())) { }
        arraylist.add(null);
        arraylist.add("welcome");
        System.out.println("After adding welcome");
        for(Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); System.out.println(iterator1.next())) { }

*/

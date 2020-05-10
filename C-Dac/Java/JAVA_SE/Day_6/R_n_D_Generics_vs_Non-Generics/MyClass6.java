import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MyClass6 
{
	public static void main(String[] args)
	{
		List<? super String>mylist=null;
		List <String>mylist1=new ArrayList<String>();
		mylist1.add("hello");
		mylist1.add("welcome");
		mylist=mylist1;
		Iterator<? extends Object> itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		mylist.add(null); 
		mylist.add("bye"); 
		System.out.println("After adding bye");

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
        arraylist1.add("welcome");
        arraylist = arraylist1;
        for(Iterator iterator = arraylist.iterator(); iterator.hasNext(); System.out.println(iterator.next())) { }
        arraylist.add(null);
        arraylist.add("bye");
        System.out.println("After adding bye");
        for(Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); System.out.println(iterator1.next())) { }

*/

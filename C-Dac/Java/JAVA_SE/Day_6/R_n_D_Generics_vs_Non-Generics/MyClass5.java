import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MyClass5 
{
	public static void main(String[] args)
	{
		List<? extends Object>mylist=null;
		List <String>mylist1=new ArrayList<String>();
		mylist1.add("hello");
		mylist1.add("welcome");
		mylist=mylist1;
		Iterator<? extends Object> itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		mylist.add(null); // no error, null can go to any referencetype
		//mylist.add("bye"); // error. if mylist points to "Dog" e.g. then how will u add "bye"?

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

*/

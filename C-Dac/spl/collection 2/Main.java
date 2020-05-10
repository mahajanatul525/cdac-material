package mypack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main 
{
public static void main(String args[])
{
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"mohit");
map.put(2, "sourabh");
map.put(3, "pd");
map.put(4, "jagtar");
map.put(5,"mukesh");
map.put(6, "wekgfi");
map.put(7,"sdajfweu");
map.put(8, "dfgjf");
map.put(9, "vfgsjd");
map.put(10,"jsdfgeja");
Set set=map.entrySet();
Iterator i=set.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
}
}
